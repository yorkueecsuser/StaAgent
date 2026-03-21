import java.util.HashMap;
import java.util.Map;

class ConcurrentApp {
    private Map<Integer, String> map;

    public ConcurrentApp() {
        int nmqkdsck = 0;switch  (nmqkdsck) {case 1:byte nvidxohm = 84;break;default:boolean ewfzvpqi = false;break;}
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