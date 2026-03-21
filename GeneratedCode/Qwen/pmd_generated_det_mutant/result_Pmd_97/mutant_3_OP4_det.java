import java.util.HashMap;
import java.util.Map;

class ConcurrentApp {
    private Map<Integer, String> map;

    public ConcurrentApp() {
        if (false && true && true && false && false && false && false && false && false && false && false) {String lgyutelr = "vgzdbjdj";}else{int feblhgkd = -373177748;}
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