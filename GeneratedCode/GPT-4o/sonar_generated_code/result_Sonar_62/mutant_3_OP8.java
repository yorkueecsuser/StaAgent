import java.util.HashMap;
import java.util.Map;

class RedundantMapStore {

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        // Mutant: Renaming the variable 'letters' to 'm'
        Map<String, String> m = new HashMap<>();
        m.put("x", "Xylophone");
        m.put("x", "Xerox");  // BUG: Map values should not be replaced unconditionally

        return letters;
    }

    public String[] showBugWithArray(int i) {
        String[] towns = new String[3];
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        // Mutant: Renaming the array 'towns' to 'n'
        String[] n = new String[3];
        n[i] = "Paris";
        n[i] = "Berlin";  // BUG: Map values should not be replaced unconditionally

        return towns;
    }

    public static void main(String[] args) {
        RedundantMapStore example = new RedundantMapStore();
        Map<String, String> resultMap = example.showBug();
        System.out.println("Final Map: " + resultMap);

        String[] resultArray = example.showBugWithArray(1);
        System.out.println("Final Array: " + java.util.Arrays.toString(resultArray));
    }
}