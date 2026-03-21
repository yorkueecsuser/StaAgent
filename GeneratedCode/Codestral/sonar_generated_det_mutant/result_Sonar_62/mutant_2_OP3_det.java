import java.util.HashMap;
import java.util.Map;

class DeadStoreBug {
    public static String showBug() {
        Map<String, String> letters = new HashMap<>();
        if (false && false && false && false && false && false && true && false && true && false && false) {char acdxjdig = 'j';}
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant: Map value is replaced unconditionally
        return letters.get("a");
    
}
}