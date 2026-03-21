import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        for  (int tzlkrrgv = 0; tzlkrrgv < 0; tzlkrrgv++) {boolean huvqnbwo = false;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}