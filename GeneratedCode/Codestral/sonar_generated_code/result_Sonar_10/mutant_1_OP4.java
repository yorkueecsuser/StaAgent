// Buggy Java code demonstrating the "SpEL expression should have a valid syntax" bug
// with an unreachable if-else statement mutation
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn"); // Using nashorn engine to demonstrate SpEL bug
        String buggyExpression = "#{invalidExpression}"; // BUG: SpEL expression should have a valid syntax
        boolean unreachableCondition = false; // Mutation: Unreachable if-else statement
        if (unreachableCondition) {
            // This block is unreachable, added to demonstrate the "Unreachable if-else statement" mutation
            return "Unreachable code executed";
        } else {
            try {
                Object result = engine.eval(buggyExpression); // Evaluating buggy SpEL expression
                return result.toString();
            } catch (ScriptException e) {
                return "Error: " + e.getMessage();
            }
        }
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}