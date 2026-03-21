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
int yxdqlmbs = 0;switch  (yxdqlmbs) {case 1:int xilrqcoh = -724896743;break;default:long hxmqwhrf = 348350761;break;}

        return numberToWordMap.get(number);
    
}
}