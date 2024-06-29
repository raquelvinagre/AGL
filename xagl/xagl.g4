
grammar xagl;

program: statement* EOF;

// Lexical rules
SPACES: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

// Terminals
ID: [a-zA-Z][a-zA-Z0-9]*;
INTEGER: [0-9]+;
NUMBER: '-'? INTEGER ('.' INTEGER)?;
STRING: '"' ~[\r\n]*? '"';
BOOLEAN: 'TRUE' | 'FALSE';
STOP: ';';
point: '(' expression ',' expression ')' | ID;

// Statements
statement:
    refreshCommand
    | moveCommand
    | loopStatement
    | stateChange;

refreshCommand: 'refresh' ID ('after' INTEGER timeUnit)? STOP;

moveCommand: 'move' ID 'by' vector STOP;

loopStatement: 'for' ID 'in' INTEGER '..' INTEGER 'do' '{' statement+ '}';

expression: INTEGER | NUMBER | BOOLEAN | STRING | ID;
timeUnit: 'ms' | 's';

vector: '(' expression ',' expression ')';

stateChange: ID ('.' ID )? '=' ID STOP;



