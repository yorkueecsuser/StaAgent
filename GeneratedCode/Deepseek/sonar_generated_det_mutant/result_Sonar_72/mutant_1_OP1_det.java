import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        int wtjtdknt = 935272000;
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}