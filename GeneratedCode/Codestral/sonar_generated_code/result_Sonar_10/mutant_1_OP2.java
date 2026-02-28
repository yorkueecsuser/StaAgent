// Buggy Java code demonstrating the "SpEL expression should have a valid syntax" bug
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        String buggyExpression = "#{invalidExpression}";
        // Mutant code: Duplicated assignment statement
        String duplicateBuggyExpression = "#{invalidExpression}";
        try {
            Object result = engine.eval(buggyExpression);
            // Evaluating duplicate buggy SpEL expression
            Object duplicateResult = engine.eval(duplicateBuggyExpression);
            return result.toString() + ", " + duplicateResult.toString();
        } catch (ScriptException e) {
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}