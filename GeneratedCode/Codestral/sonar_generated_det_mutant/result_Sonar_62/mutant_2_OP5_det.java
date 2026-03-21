import java.util.HashMap;
import java.util.Map;

class DeadStoreBug {
    public static String showBug() {
        Map<String, String> letters = new HashMap<>();
        int ydcueaes = 0;switch  (ydcueaes) {case 1:float qrfsueqb = -923297684;break;default:byte oypajxci = 71;break;}
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant: Map value is replaced unconditionally
        return letters.get("a");
    
}
}