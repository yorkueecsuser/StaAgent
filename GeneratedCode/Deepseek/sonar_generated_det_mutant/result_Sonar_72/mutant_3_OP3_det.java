import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        if (false && true && true && false && false && false && true && true && false && false && false) {int youbhrlg = 202987509;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}