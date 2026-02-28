// Buggy Java code with mutation: Unreachable while loop
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    // Static method returning false to make the while loop unreachable
    private static boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        // Unreachable while loop mutation
        while (getCondition()) {
            // This block of code should never execute
            System.out.println("This is an unreachable block of code");
        }

        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn"); // Using nashorn engine to demonstrate SpEL bug
        String buggyExpression = "#{invalidExpression}"; // BUG: SpEL expression should have a valid syntax
        try {
            Object result = engine.eval(buggyExpression); // Evaluating buggy SpEL expression
            return result.toString();
        } catch (ScriptException e) {
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}