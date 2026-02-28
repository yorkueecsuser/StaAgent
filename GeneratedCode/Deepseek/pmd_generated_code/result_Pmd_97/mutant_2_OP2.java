import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    public void getMyInstance() {
        // BUG: UseConcurrentHashMap
        Map map1 = new HashMap();           // fine for single-threaded access
        Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads
        Map map3 = new ConcurrentHashMap(); // mutant code to be added
        Map map4 = new HashMap();           // for demonstration purposes. A real-world scenario would use someModule.methodThatReturnMap()
    }

    public void showBug() {
        getMyInstance();
    }
}