import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class InvalidSpELExpressionBug {
    public String showBug(String input) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        String buggyExpression = "#{invalidExpression}"; // Original assignment
        String duplicatedExpression = "#{invalidExpression}"; // Duplicated assignment
        try {
            Object result = engine.eval(buggyExpression);
            Object duplicatedResult = engine.eval(duplicatedExpression); // Evaluating duplicated SpEL expression
            return result.toString() + "\n" + duplicatedResult.toString();
        } catch (ScriptException e) {
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        System.out.println(bugDemo.showBug("Test"));
    }
}