import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    public void getMyInstance() {
        // BUG: UseConcurrentHashMap
        Map map1 = new HashMap();           // fine for single-threaded access
        Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads
        // the following case will be ignored by this rule
        Map map3 = new HashMap(); // for demonstration purposes. A real-world scenario would use someModule.methodThatReturnMap()
        boolean condition = false;
        if (condition) { // mutation begins here
            int x = 10;
        }
        else { // mutation ends here
            int y = 20;
        }

        boolean condition1 = true;
        if (condition1) { // mutation begins here
            int a = 30;
        }
        else { // mutation ends here
            int b = 40;
        }
    }

    public void showBug() {
        getMyInstance();
    }
}