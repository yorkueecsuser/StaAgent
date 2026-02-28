// Buggy Java code demonstrating the "SpEL expression should have a valid syntax" bug, with an added unreachable while loop mutant
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    private boolean getCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }

    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn"); // Using nashorn engine to demonstrate SpEL bug
        String buggyExpression = "#{invalidExpression}"; // BUG: SpEL expression should have a valid syntax

        // MUTANT: Added an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be reached
            System.out.println("Unreachable code");
        }

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