import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        boolean qadsoqjn = false;while (qadsoqjn && false && true && false && false && false && false && false && false && false && true && false) {short ubsjdlwm = -15;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}