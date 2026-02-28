import java.util.HashMap;
import java.util.Map;

class RedundantMapStore {
    
    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally
        
        // Inserted unreachable if-else statement
        boolean isUnreachable = checkUnreachable();
        if (isUnreachable) {
            letters.put("b", "Banana");
        } else {
            letters.put("c", "Cat");
        }

        return letters;
    }

    public String[] showBugWithArray(int i) {
        String[] towns = new String[3];
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally
        
        // Inserted unreachable if-else statement
        boolean isArrayUnreachable = checkUnreachable();
        if (isArrayUnreachable) {
            towns[i] = "Berlin";
        } else {
            towns[i] = "Paris";
        }

        return towns;
    }
    
    // Dummy method to simulate unreachable condition
    private boolean checkUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        RedundantMapStore example = new RedundantMapStore();
        Map<String, String> resultMap = example.showBug();
        System.out.println("Final Map: " + resultMap);

        String[] resultArray = example.showBugWithArray(1);
        System.out.println("Final Array: " + java.util.Arrays.toString(resultArray));
    }
}