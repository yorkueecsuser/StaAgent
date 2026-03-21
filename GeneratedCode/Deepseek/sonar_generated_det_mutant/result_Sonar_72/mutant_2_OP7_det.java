import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        boolean cgmlwwes = false;while (cgmlwwes && false && true && true && false && true && true && false && true && false && false && false) {boolean vohcymfu = true;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}