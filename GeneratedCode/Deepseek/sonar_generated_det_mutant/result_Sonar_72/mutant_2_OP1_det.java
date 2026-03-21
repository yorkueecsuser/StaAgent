import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        String favgspgp = "ftawedlb";
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}