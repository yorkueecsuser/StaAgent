// Buggy Java code demonstrating the "SpEL expression should have a valid syntax" and "Unreachable switch statement" bugs
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn"); // Using nashorn engine to demonstrate SpEL bug
        String buggyExpression = "#{invalidExpression}"; // BUG: SpEL expression should have a valid syntax
        try {
            Object result = engine.eval(buggyExpression); // Evaluating buggy SpEL expression
            return result.toString();
        } catch (ScriptException e) {
            int unreachableValue = -1; // Value that does not match any case labels
            switch (unreachableValue) { // Unreachable switch statement
                case 1:
                    System.out.println("This line will never be executed");
                    break;
                default:
                    System.out.println("Default case reached, but this line will also never be executed");
            }
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}