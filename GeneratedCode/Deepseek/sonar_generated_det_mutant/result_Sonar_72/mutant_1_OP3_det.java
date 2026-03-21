import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        if (true && false && true && false && true && false && true && false && true && false && false) {byte nazgtkyj = -56;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}