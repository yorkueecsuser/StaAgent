import java.util.HashMap;
import java.util.Map;

class SpelExpressionBug {
public Object showBug(String key){
    Map < String , String > map = new HashMap < >();
    map.put("name" , "John Doe");
    String spelExpression = "#{map['key']}";
    spelExpression = "#{map['key']}";
    if(spelExpression.contains("'key'")) { return map.get(key); } else { return spelExpression; }
}

    public static void main(String[] args) {
        SpelExpressionBug bugDemo = new SpelExpressionBug();
        System.out.println(bugDemo.showBug("name")); // Expected to print the SpEL expression string due to the bug
    }
}