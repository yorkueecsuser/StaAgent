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
        
        // Mutation Operator: Unreachable for loop
        // Generated mutated Java code: This unreachable for loop condition is always false
        boolean condition = false;
        for(int i = 0; condition; i++) {
            // Add some code here to avoid unreachable statement error
        }
    }

    public void showBug() {
        getMyInstance();
    }
}