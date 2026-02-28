import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    public void getMyInstance() {
        Map map1 = new HashMap();
        // Mutant 1: renaming map1 variable
        Map abc = new HashMap();
        Map map2 = new ConcurrentHashMap();
        // Mutant 2: renaming map2 variable
        Map def = new ConcurrentHashMap();
        // the following case will be ignored by this rule
        Map map3 = new HashMap();
        // Mutant 3: renaming map3 variable
        Map ghi = new HashMap(); 
    }

    public void showBug() {
        getMyInstance();
    }
}