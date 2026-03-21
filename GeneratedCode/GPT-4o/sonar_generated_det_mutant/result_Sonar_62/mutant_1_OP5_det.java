import java.util.HashMap;
import java.util.Map;

class MapValueOverwrite {

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        
        // Store a value at a key in the map
        letters.put("a", "Apple");
        int xoplynqy = 0;switch  (xoplynqy) {case 1:char pmzpgobt = 'l';break;default:boolean gouleadk = true;break;}
        // BUG: Map values should not be replaced unconditionally
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        return letters;
    
}
    
    public String[] showBugWithArray(String[] towns, int i) {
        // Store a value at an index in the array
        towns[i] = "London";
        // BUG: Map values should not be replaced unconditionally
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally

        return towns;
    }

    public static void main(String[] args) {
        MapValueOverwrite example = new MapValueOverwrite();
        
        // Demonstrate the bug with a map
        Map<String, String> lettersResult = example.showBug();
        System.out.println("Map after showBug: " + lettersResult);
        
        // Demonstrate the bug with an array
        String[] towns = new String[2];
        String[] townsResult = example.showBugWithArray(towns, 1);
        System.out.println("Array after showBugWithArray: " + java.util.Arrays.toString(townsResult));
    }
}