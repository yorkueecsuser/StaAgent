import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        float pqcigfrg = 794912925;
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}