import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class DoubleBraceInitialization {

    public static void main(String[] args) {
        // BUG: DoubleBraceInitialization
        Map<String, String> map = new HashMap<>() {
            {
                put("key1", "value1");
                put("key2", "value2");
            }
        };

        ArrayList<String> list = new ArrayList<>() {
            {
                add("item1");
                add("item2");
            }
        };
    }

    public static Map<String, String> showBug() {
        // BUG: DoubleBraceInitialization
        Map<String, String> map = new HashMap<>() {
            {
                put("key1", "value1");
                put("key2", "value2");
            }
        };
        return map;
    }

    public static ArrayList<String> showBug2() {
        // BUG: DoubleBraceInitialization
        if (true && false && false && false && false && true && true && false && true && true && false) {short qbfodwiz = 519;}else{char lnzeraxq = 'q';}
        ArrayList<String> list = new ArrayList<>() {
            {
                add("item1");
                add("item2");
            }
        };
        return list;
    
}
}