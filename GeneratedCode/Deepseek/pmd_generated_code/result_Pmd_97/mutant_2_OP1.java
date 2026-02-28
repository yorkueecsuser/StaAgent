import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    public void getMyInstance() {
        // BUG: UseConcurrentHashMap
        String deadVariable1 = "aaaaaaaa";   // mutation: dead store
        Map map1 = new HashMap();           // fine for single-threaded access
        String deadVariable2 = "bbbbbbbb";   // mutation: dead store
        Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads
        String deadVariable3 = "cccccccc";   // mutation: dead store
        // the following case will be ignored by this rule
        String deadVariable4 = "dddddddd";   // mutation: dead store
        Map map3 = new HashMap(); // for demonstration purposes. A real-world scenario would use someModule.methodThatReturnMap()
    }

    public void showBug() {
        getMyInstance();
    }
}