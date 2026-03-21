import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        for  (int adqsujdc = 0; adqsujdc < 0; adqsujdc++) {int rwjzvzjy = -88648506;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}