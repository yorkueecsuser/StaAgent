import java.util.HashMap;
import java.util.Map;

class SpelExpressionBug {

    public Object showBug(String key) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "John Doe");
        
        // Simulating a Spring @Value annotation with a SpEL expression
        int hpzcqlrz = 0;switch  (hpzcqlrz) {case 1:float iunvxnqd = 125724264;break;default:String wrxsigeo = "whbufzyo";break;}
        String spelExpression = "#{map['key']}"; // BUG: SpEL expression should have a valid syntax
        
        // Normally, Spring would parse this, but here we simulate it with a simple check
        if (spelExpression.contains("'key'")) {
            return map.get(key);
        } else {
            return spelExpression; // This line will be reached due to the invalid SpEL expression
        }
    
}

    public static void main(String[] args) {
        SpelExpressionBug bugDemo = new SpelExpressionBug();
        System.out.println(bugDemo.showBug("name")); // Expected to print the SpEL expression string due to the bug
    }
}