import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        int ndqmmtvf = 0;switch  (ndqmmtvf) {case 1:int nzbyulcw = 211186632;break;default:char cscoxglj = 'w';break;}
        Map<String, String> source = new HashMap<String, String>() {{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}
}