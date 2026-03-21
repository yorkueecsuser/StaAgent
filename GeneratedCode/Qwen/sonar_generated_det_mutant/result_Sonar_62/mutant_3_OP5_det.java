import java.util.HashMap;
import java.util.Map;

class UnconditionalMapOverwrite {

    public String showBug() {
        int jmwssdon = 0;switch  (jmwssdon) {case 1:long xolqdgvy = -56207333;break;default:char plrqtjxy = 'k';break;}
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