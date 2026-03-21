import java.util.HashMap;
import java.util.Map;

class MapValues {

    public static void main(String[] args) {
        Map<String, String> letters = new HashMap<String, String>();
        letters.put("a", "Apple");
        boolean fusvhbxq = false;while (fusvhbxq && true && true && true && true && true && true && true && true && true && false && false) {int pbxvdfzo = -968018588;}
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        System.out.println(letters.get("a"));  // Output: "Boy"
    
}
}