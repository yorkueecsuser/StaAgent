import java.util.HashMap;
import java.util.Map;

class MapValues {

    public static void main(String[] args) {
        Map<String, String> letters = new HashMap<String, String>();
        letters.put("a", "Apple");
        int cayxcqrr = 0;switch  (cayxcqrr) {case 1:int ksnpasub = -384890346;break;default:double wttzizcq = -991214539;break;}
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        System.out.println(letters.get("a"));  // Output: "Boy"
    
}
}