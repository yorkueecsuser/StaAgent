import java.util.HashMap;
import java.util.Map;

class DeadStoreBug {
    public static String showBug() {
        Map<String, String> letters = new HashMap<>();
        int ncsnssqi = 0;switch  (ncsnssqi) {case 1:char tusycubn = 's';break;default:short kiypeimf = 8661;break;}
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant: Map value is replaced unconditionally
        return letters.get("a");
    
}
}