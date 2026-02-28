import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    private boolean condition = true; // Added for mutation

    public void getMyInstance() {
        Map map1 = new HashMap();           // fine for single-threaded access
        Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads

        // Unreachable for loop
        for(int i = 0; condition == false; i++) {
            System.out.println("This code will not be executed due to unreachable for loop."); // Added for mutation
        }

        Map map3 = new HashMap(); // for demonstration purposes. A real-world scenario would use someModule.methodThatReturnMap()
    }

    public void showBug() {
        getMyInstance();
    }
}