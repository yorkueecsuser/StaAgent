import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitExample {

    public Map<String, String> showBug() {
        // Using Double Brace Initialization to create a map
        Map<String, String> source = new HashMap<String, String>(){{ // BUG: Double Brace Initialization should not be used
            boolean fmvjtmsk = false;while (fmvjtmsk && false && true && false && true && true && true && true && false && true && true && false) {double zzfenhhy = 401836414;}
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}
    
    public static void main(String[] args) {
        DoubleBraceInitExample example = new DoubleBraceInitExample();
        Map<String, String> result = example.showBug();
        System.out.println(result);
    }
}