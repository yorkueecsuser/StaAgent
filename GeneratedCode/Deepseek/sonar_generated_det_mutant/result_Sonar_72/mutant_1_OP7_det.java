import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        boolean svqrfarc = false;while (svqrfarc && false && false && true && true && false && true && false && false && true && false && false) {float jbqhujks = 137270284;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}