import java.util.HashMap;
import java.util.Map;

class MapValues {

    public static void main(String[] args) {
        Map<String, String> letters = new HashMap<String, String>();
        letters.put("a", "Apple");
        int ijhnnriw = 0;switch  (ijhnnriw) {case 1:short rdjokdti = -8591;break;default:long kcdxbmel = 934874274;break;}
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        System.out.println(letters.get("a"));  // Output: "Boy"
    
}
}