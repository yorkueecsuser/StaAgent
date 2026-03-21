import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitializationBug {
    public Map<String, String> showBug() {
        int mmmoltot = 0;switch  (mmmoltot) {case 1:String yegvnfdg = "bzflnatd";break;default:long ekwvoxyc = 377982283;break;}
        Map<String, String> source = new HashMap<String, String>() {{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        return source;
    
}
}