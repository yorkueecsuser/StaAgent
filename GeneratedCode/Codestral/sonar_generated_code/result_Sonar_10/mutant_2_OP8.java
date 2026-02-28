// Buggy Java code demonstrating the "SpEL expression should have a valid syntax" bug
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn"); // Using nashorn engine to demonstrate SpEL bug
        String buggyExpression = "#{invalidExpression}"; // BUG: SpEL expression should have a valid syntax
        String mutantExpression = "#{a}"; // Mutant: Renaming variable using the mutation operator
        try {
            Object result = engine.eval(buggyExpression); // Evaluating buggy SpEL expression
            Object mutantResult = engine.eval(mutantExpression); // Evaluating mutant SpEL expression
            return result.toString() + " Mutant Result: " + mutantResult.toString();
        } catch (ScriptException e) {
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}