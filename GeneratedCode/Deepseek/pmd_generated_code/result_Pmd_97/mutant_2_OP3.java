import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    public void getMyInstance() {
        Map map1 = new HashMap();
        Map map2 = new ConcurrentHashMap();
        Map map4 = new HashMap(); // mutated code
        if (false) { // mutated code
            map4 = new HashMap(); // mutated code
        } // mutated code
    }

    public void showBug() {
        getMyInstance();
    }
}