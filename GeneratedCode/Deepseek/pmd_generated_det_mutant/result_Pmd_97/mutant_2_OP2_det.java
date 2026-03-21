import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
public void getMyInstance() {
    Map map1 = new HashMap();
    map1 = new HashMap();
    Map map2 = new ConcurrentHashMap();
    Map map3 = new HashMap();
}

    public void showBug() {
        getMyInstance();
    }
}