import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        if (true && true && false && true && true && true && false && true && true && false && false) {boolean tftuelqt = false;}else{char itnismkz = 't';}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}