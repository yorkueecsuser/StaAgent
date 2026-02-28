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

        // Mutant: Unreachable switch statement - Code Added
        boolean flag = false; // Mutation Operator: Unreachable switch statement
        switch (flag? 1 : 0) { // Mutation Operator: Unreachable switch statement
            case 1:
                System.out.println("This code is unreachable");
                break;
        }
    }

    public void showBug() {
        getMyInstance();
    }
}