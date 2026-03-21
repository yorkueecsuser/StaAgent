import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationExample {

    public Map<String, String> showBug() {
        boolean qlumcvms = false;while (qlumcvms && true && false && true && true && true && false && true && true && true && false && false) {char aiywmjjg = 'c';}
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