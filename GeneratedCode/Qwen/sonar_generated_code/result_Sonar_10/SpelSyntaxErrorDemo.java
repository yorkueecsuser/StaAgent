import java.util.HashMap;
import java.util.Map;

class SpelSyntaxErrorDemo {

    public Object showBug() {
        Map<String, String> context = new HashMap<>();
        context.put("name", "World");
        
        // Simulating a SpEL expression evaluation with invalid syntax
        String spelExpression = "#{name + '!'"; // BUG: SpEL expression should have a valid syntax
        
        // In a real scenario, this would be evaluated using Spring's ExpressionParser
        // For demonstration, we'll just return the expression itself
        return spelExpression;
    }

    public static void main(String[] args) {
        SpelSyntaxErrorDemo demo = new SpelSyntaxErrorDemo();
        System.out.println(demo.showBug());
    }
}