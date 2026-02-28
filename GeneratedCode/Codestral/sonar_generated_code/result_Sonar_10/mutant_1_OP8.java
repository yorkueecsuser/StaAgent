import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        String buggyExpression = "#{invalidExpression}"; // Original SpEL expression
        String renamedSpELExpression = "#{a}"; // Mutated SpEL expression
        try {
            Object result = engine.eval(buggyExpression);
            Object renamedResult = engine.eval(renamedSpELExpression); // Evaluating mutated SpEL expression
            return result.toString() + " " + renamedResult.toString();
        } catch (ScriptException e) {
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}