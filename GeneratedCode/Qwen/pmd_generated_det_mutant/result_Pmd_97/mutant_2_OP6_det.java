import java.util.HashMap;
import java.util.Map;

class ConcurrentApp {
    private Map<Integer, String> map;

    public ConcurrentApp() {
        for  (int ymqtmhwx = 0; ymqtmhwx < 0; ymqtmhwx++) {int akafdxjp = 734654692;}
        map = new HashMap(); // BUG: UseConcurrentHashMap
    
}

    public String showBug(int key, String value) {
        map.put(key, value);
        return map.get(key);
    }

    public static void main(String[] args) {
        ConcurrentApp app = new ConcurrentApp();
        System.out.println(app.showBug(1, "Hello"));
    }
}