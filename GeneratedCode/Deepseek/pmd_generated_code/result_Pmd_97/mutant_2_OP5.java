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
        // Mutation Starts
        // Unreachable switch statement
        switch(0) {
            case 1:
                if (false) {
                    System.out.println("Unreachable Code"); // Unreachable code
                }
                break;
            default:
                System.out.println("Default Case"); // default case
                break;
        }
        // Mutation Ends
    }

    public void showBug() {
        getMyInstance();
    }
}