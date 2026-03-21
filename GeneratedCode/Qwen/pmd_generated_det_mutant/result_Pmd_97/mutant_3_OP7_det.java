import java.util.HashMap;
import java.util.Map;

class ConcurrentApp {
    private Map<Integer, String> map;

    public ConcurrentApp() {
        boolean wwbxyomj = false;while (wwbxyomj && false && false && false && false && false && false && true && false && false && true && false) {int zcgigfts = 28060907;}
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