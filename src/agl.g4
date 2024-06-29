grammar agl;

program: statement* EOF;

// Lexical rules
SPACES: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '#(' .*? '#)' -> skip;

// Terminals
ObjectID:
    'Line'
    | 'Rectangle'
    | 'Ellipse'
    | 'Arc'
    | 'ArcChord'
    | 'PieSlice'
    | 'Text'
    | 'Dot';

ColorID:
    'alice blue'
    | 'black'
    | 'red'
    | 'orange'
    | 'blue'
    | 'tomato'
    | 'cyan'
    | 'wheat'
    | 'purple'
    | 'pink';

PropertyID:
    'Ox'
    | 'Oy'
    | 'width'
    | 'height'
    | 'title'
    | 'background'
    | 'fill'
    | 'text'
    | 'length'
    | 'start'
    | 'extent'
    | 'outline'
    | 'state';

// ID consists of a string starting with a lowercase letter followed by any number of letters. This
// can be done because we define specific IDs in their own rule (ObjectID and ColorID), and in this
// way, there is no conflict between ID, specific IDs, and STRING.
ID: [a-z][a-zA-Z0-9]*;
INTEGER: [0-9]+;
NUMBER: '-'? INTEGER ('.' INTEGER)?;
STRING: '"' ~[\r\n]*? '"';
BOOLEAN: 'TRUE' | 'FALSE';
// Most commands end with a semicolon, except for statements including curly ({}) braces
STOP: ';';

point: vector | ID;

vector: '(' (polarcoordinates | vectorANDpointExpr) ')';

vectorANDpointExpr: primaryExpr ',' primaryExpr;

polarcoordinates: polarangle ':' polarlength;

polarangle: primaryExpr ('pi' | 'deg') | ID;

polarlength: primaryExpr | ID;

// Statements
statement:
    viewDeclaration
    | loopDeclaration
    | variableDeclaration
    | objectInstantiation
    | modelInstantiation
    | propertyAssignment
	| propertyEnumAssignment
    | variableUpdate
    | objectUpdate
    | multiplePropertyAssignment
    | command
    | printStatement
    | conditionalStatement
    | listDeclaration
    | listElementAssignment
    | listElementAccess
    | whileLoop
    | scriptDeclaration
    | playCommand
    | modelDeclaration
    | enumDeclaration
	| conditionalEnumStatement
    | actionOnEnum;

viewDeclaration: ID ':' 'View' multiplePropertyAssignment;

variableDeclaration:
    ID ':' (
        type '=' (waitCommand | expression) STOP
        | objectInstantiation
    );

loopDeclaration:
    'for' ID 'in' (ID | INTEGER '..' INTEGER ('..' INTEGER)?) 'do' '{' statement+ '}';

whileLoop: 'while' booleanExpr 'do' '{' statement+ '}';

objectInstantiation:
    ObjectID 'at' point multiplePropertyAssignment;

objectUpdate: 'with' (ID ('.' ID)? 'do') '{' propertyList '}';

modelInstantiation: ID ':' ModelID 'at' point STOP; 

propertyAssignment: (ID '.')? PropertyID '=' propertyValue STOP;

variableUpdate: ID '=' (waitCommand | expression) STOP;

multiplePropertyAssignment: 'with' '{' propertyList '}';

printStatement: 'print' (STRING | ID | listElementAccess) STOP;

conditionalStatement:
    'if' booleanExpr '{' statement+ '}' (elseIfClause)* (
        elseClause
    )?;

elseIfClause: 'else if' booleanExpr '{' statement+ '}';
elseClause: 'else' '{' statement+ '}';

// List-related rules
listDeclaration:
    ID ':' 'List' '<' type '>' '=' '[' (
        expression (',' expression)*
    )? ']' STOP;

listElementAssignment:
    ID '[' primaryExpr ']' '=' expression STOP;

listElementAccess: ID '[' primaryExpr ']';

// Commands
command:
    waitCommand
    | closeCommand
    | refreshCommand
    | moveCommand;

waitCommand: 'wait mouse click';
closeCommand: 'close' ID STOP;
refreshCommand: 'refresh' ID ('after' INTEGER 'ms')? STOP;
moveCommand: 'move' ID 'by' point STOP;

// Properties
propertyValue:
    INTEGER
    | NUMBER
    | ColorID
    | BOOLEAN
    | STRING
    | point;

propertyList: propertyAssignment+;

// Expressions
expression:
    primaryExpr
    | arithmeticExpr
    | booleanExpr
    | vector
    | stringExpr;

primaryExpr: '-'? ( INTEGER | NUMBER | ID | ModelID | listElementAccess );

arithmeticExpr:
    arithmeticExpr ('*' | '/' | '+' | '-') primaryExpr
    | primaryExpr;

booleanExpr:
    BOOLEAN
    // BOOLEAN for var == TRUE cases
    | ID comparisonOperator (primaryExpr | BOOLEAN)
    | ID
    | 'NOT' booleanExpr
    | booleanExpr comparisonOperator primaryExpr
    | booleanExpr ('AND' | 'OR') booleanExpr;

stringExpr: STRING;

comparisonOperator: '<' | '<=' | '>' | '>=' | '==' | '!=';

// Types
type:
    'Number'
    | 'Integer'
    | 'String'
    | 'Point'
    | 'Vector'
    | 'Time'
    | 'Boolean'
    | 'List' '<' type '>'
    | 'Script';

// Script-related rules
scriptDeclaration: ID ':' 'Script' '=' scriptSource STOP;

scriptSource: 'load' STRING | 'input' STRING;

playCommand: 'play' ID 'with' '{' scriptAssignment+ '}';

scriptAssignment: ID '=' ID STOP;

ModelID:
    [a-zA-Z][a-zA-Z0-9]*
    | 'Polyline'
    | 'Polygon'
    | 'Spline'
    | 'Blob';

// Model-related rules
modelDeclaration: ModelID '::' 'Model' '{' modelBody '}';

modelBody: (modelElement)*;

modelElement: variableDeclaration | objectInstantiation | enumDeclaration | actionOnEnum;

// Enum-related rules
enumDeclaration: ID ':' 'Enum' 'in' '{' enumValues '}';
enumValues: ModelID (',' ModelID)*;

// Action on enum
actionOnEnum: 'action on' ID '{' enumActionBody '}';
enumActionBody: (enumCase)+;
enumCase: conditionalEnumStatement;

EnumID:
    [a-zA-Z][a-zA-Z]*;


conditionalEnumStatement:
    'if' booleanExpr 'do' statement+ (elseIfEnumClause)* (elseEnumClause)?;

elseIfEnumClause: 
	'else if' booleanExpr 'do' statement+;
	
elseEnumClause: 
	'else' 'do' statement+ ;

propertyEnumAssignment: ID '.' ID '=' ModelID STOP;
