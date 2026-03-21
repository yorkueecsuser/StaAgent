import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        boolean vciccnqb = false;while (vciccnqb && false && false && false && false && true && true && true && true && true && false && false) {String shkdylym = "zhgivaoh";}
        Map<String, String> source = new HashMap<String, String>() {{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}
}