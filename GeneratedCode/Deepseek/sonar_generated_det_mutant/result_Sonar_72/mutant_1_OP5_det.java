import java.util.HashMap;
import java.util.Map;

class BugExample {
    public Map<String, String> showBug() {
        int ksgcoxxu = 0;switch  (ksgcoxxu) {case 1:char mmzzbrvv = 'q';break;default:double vwsexmry = 566688953;break;}
        Map source = new HashMap(){{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        return source;
    
}
}