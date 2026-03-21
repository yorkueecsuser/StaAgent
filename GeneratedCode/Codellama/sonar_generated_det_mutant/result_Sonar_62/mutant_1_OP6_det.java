import java.util.HashMap;
import java.util.Map;

class MapValues {

    public static void main(String[] args) {
        Map<String, String> letters = new HashMap<String, String>();
        letters.put("a", "Apple");
        for  (int nbbeizsf = 0; nbbeizsf < 0; nbbeizsf++) {long sizycnor = -519086786;}
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        System.out.println(letters.get("a"));  // Output: "Boy"
    
}
}