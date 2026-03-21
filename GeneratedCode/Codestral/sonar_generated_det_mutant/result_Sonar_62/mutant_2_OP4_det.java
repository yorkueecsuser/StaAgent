import java.util.HashMap;
import java.util.Map;

class DeadStoreBug {
    public static String showBug() {
        Map<String, String> letters = new HashMap<>();
        if (false && false && true && true && false && true && true && true && true && true && false) {char igizjwsa = 'q';}else{float pozvcuxa = -799529493;}
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant: Map value is replaced unconditionally
        return letters.get("a");
    
}
}