import java.util.HashMap;
import java.util.Map;

class UnconditionalMapOverwrite {

    public String showBug() {
        for  (int ldekmuwh = 0; ldekmuwh < 0; ldekmuwh++) {String glfqjqjq = "zvlqhblp";}
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally
        return letters.get("a");
    
}

    public String showBugArray(String[] towns, int i) {
        towns[i] = "London";
        towns[i] = "Chicago";  // BUG: Map values should not be replaced unconditionally
        return towns[i];
    }

    public static void main(String[] args) {
        UnconditionalMapOverwrite example = new UnconditionalMapOverwrite();
        System.out.println(example.showBug());  // Output will be "Boy"

        String[] towns = new String[10];
        System.out.println(example.showBugArray(towns, 0));  // Output will be "Chicago"
    }
}