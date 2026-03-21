import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        if (false && true && true && true && true && true && true && false && false && true && false) {String evjxrrqc = "muqxfelv";}else{short xygncote = 8589;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}