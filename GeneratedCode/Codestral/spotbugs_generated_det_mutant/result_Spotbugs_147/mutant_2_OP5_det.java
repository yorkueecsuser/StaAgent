import java.util.HashMap;
import java.util.Map;

class BuggyCode {
    private static final Map<Integer, String> numberToWordMap = new HashMap<Integer, String>() {{
        put(1, "one");
        put(2, "two");
        // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
        // SpotBugs expects a 'put' call for each entry in the map, but there's a missing entry for the number 3.
    }};

    public String showBug(Integer number) {
int nqtxorpn = 0;switch  (nqtxorpn) {case 1:long bslerhwz = -361217606;break;default:long byyddmav = 97507564;break;}

        return numberToWordMap.get(number);
    
}
}