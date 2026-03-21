import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        int clnkjjvl = 0;switch  (clnkjjvl) {case 1:byte ubafiren = 58;break;default:boolean tvfzrzjx = true;break;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}