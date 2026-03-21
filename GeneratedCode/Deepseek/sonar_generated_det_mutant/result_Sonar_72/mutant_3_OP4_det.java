import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        if (true && false && true && false && true && false && true && true && false && true && false) {byte cpjqitnb = 108;}else{String sgdfusol = "fgiusxlo";}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}