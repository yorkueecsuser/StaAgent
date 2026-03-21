import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationExample {

    public Map<String, String> showBug() {
        if (true && true && false && true && false && false && false && true && true && false && false) {double sotctflb = 31685647;}else{double yzpwwnqz = -684636806;}
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