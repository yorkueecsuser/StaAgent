import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        int addgrtzf = 0;switch  (addgrtzf) {case 1:float gwnnjskr = -278740480;break;default:boolean ylxvkomu = true;break;}
        Map<String, String> source = new HashMap<String, String>() {{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}
}