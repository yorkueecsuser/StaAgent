import java.util.HashMap;
import java.util.Map;

class MapValues {

    public static void main(String[] args) {
        Map<String, String> letters = new HashMap<String, String>();
        letters.put("a", "Apple");
        int ihrzekef = 0;switch  (ihrzekef) {case 1:boolean hdhfdtjh = true;break;default:float jugglkzr = 479259376;break;}
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        System.out.println(letters.get("a"));  // Output: "Boy"
    
}
}