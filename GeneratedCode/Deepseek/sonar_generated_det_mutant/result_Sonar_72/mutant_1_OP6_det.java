import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        for  (int abzcuxre = 0; abzcuxre < 0; abzcuxre++) {long rtmulrfs = 100666050;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}