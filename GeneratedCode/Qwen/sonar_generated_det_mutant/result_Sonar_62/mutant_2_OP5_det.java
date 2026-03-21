import java.util.HashMap;
import java.util.Map;

class UnconditionalMapOverwrite {

    public String showBug() {
        int kbtvuiev = 0;switch  (kbtvuiev) {case 1:double zlymyzmv = -459430236;break;default:char uvcjyujr = 'p';break;}
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