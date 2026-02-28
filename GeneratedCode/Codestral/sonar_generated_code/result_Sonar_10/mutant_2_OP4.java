import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        String buggyExpression = "#{invalidExpression}";

        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            // Unreachable code for the mutation operator
            String unreachableExpression = "#{unreachableExpression}";
            try {
                Object result = engine.eval(unreachableExpression);
                return result.toString();
            } catch (ScriptException e) {
                return "Unreachable Error: " + e.getMessage();
            }
        } else {
            try {
                Object result = engine.eval(buggyExpression);
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