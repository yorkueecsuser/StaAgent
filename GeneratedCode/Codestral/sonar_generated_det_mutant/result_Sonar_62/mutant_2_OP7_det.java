import java.util.HashMap;
import java.util.Map;

class DeadStoreBug {
    public static String showBug() {
        Map<String, String> letters = new HashMap<>();
        boolean kvtinowu = false;while (kvtinowu && true && false && true && false && true && false && true && true && false && true && false) {String eptlfsmt = "agfsfzev";}
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant: Map value is replaced unconditionally
        return letters.get("a");
    
}
}