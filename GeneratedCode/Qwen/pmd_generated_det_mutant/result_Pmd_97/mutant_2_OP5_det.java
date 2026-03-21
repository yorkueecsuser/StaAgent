import java.util.HashMap;
import java.util.Map;

class ConcurrentApp {
    private Map<Integer, String> map;

    public ConcurrentApp() {
        int tveppwjp = 0;switch  (tveppwjp) {case 1:int vztgubtr = -879163838;break;default:int ghjbpqmz = 736022833;break;}
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