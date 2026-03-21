import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        int tnuyaldv = 0;switch  (tnuyaldv) {case 1:char avkehyua = 'r';break;default:String ekawwfdy = "owaghcbc";break;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}