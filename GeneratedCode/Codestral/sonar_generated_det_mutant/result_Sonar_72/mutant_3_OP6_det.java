import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        for  (int zojkrepd = 0; zojkrepd < 0; zojkrepd++) {byte nesnccdj = -63;}
        Map<String, String> source = new HashMap<String, String>() {{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}
}