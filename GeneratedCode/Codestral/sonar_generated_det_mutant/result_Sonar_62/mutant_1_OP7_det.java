import java.util.HashMap;
import java.util.Map;

class DeadStoreBug {
    public static String showBug() {
        Map<String, String> letters = new HashMap<>();
        boolean iuerguji = false;while (iuerguji && true && true && true && true && true && false && false && false && false && false && false) {int hkjlkvkj = -759734511;}
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant: Map value is replaced unconditionally
        return letters.get("a");
    
}
}