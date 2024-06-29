import org.stringtemplate.v4.*;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class SemanticAnaliser extends aglBaseVisitor<String> {

    private STGroup templates = new STGroupFile("templates/template.stg");
    private StringBuilder code = new StringBuilder();
    final Map<String, String> variables = new HashMap<>();

    
    public Map<String, String> getVariables() {
        return variables;
    }

    public void addVariable(String varName, String value) {
        if (variables.containsKey(varName)) {
            variables.replace(varName, value);
        } else {
            variables.put(varName, value);
        }
    }

    public void updateVariable(String varName, String value) {
        if (variables.containsKey(varName)) {
            variables.replace(varName, value);
        }
    }

    public String getVariable(String varName) {
        if (!variables.containsKey(varName)) {
            return null;
        }
        return variables.get(varName);
    }

   

}