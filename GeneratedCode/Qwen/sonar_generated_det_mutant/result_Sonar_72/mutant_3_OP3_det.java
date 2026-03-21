import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationExample {

    public Map<String, String> showBug() {
        if (false && false && true && true && false && false && false && true && false && true && false) {float lvgopmvz = -369158409;}
        Map<String, String> source = new HashMap(){{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}

    public static void main(String[] args) {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        Map<String, String> result = example.showBug();
        System.out.println(result);
    }
}