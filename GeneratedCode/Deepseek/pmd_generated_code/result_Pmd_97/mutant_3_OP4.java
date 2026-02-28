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

        // MUTANT CODE BEGIN
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
            System.out.println("This code is unreachable");
        }
        for (int i = 0; false; i++) {
            // unreachable code
            System.out.println("This code is unreachable");
        }
        if (false) {
            // unreachable code
            System.out.println("This code is unreachable");
        }
        int value = 0;
        switch(value) {
            case 1:
                // unreachable code
                System.out.println("This code is unreachable");
                break;
        }
        // MUTANT CODE END
    }

    public void showBug() {
        getMyInstance();
    }

    private boolean getCondition() {
        return false;
    }
}