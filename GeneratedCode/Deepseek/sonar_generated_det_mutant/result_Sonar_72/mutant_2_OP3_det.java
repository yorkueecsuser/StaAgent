import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        if (true && false && true && false && true && true && false && false && false && false && false) {long lsqekoyv = 431836517;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}