import java.util.HashMap;
import java.util.Map;

class DeadStoreBug {
    public static String showBug() {
        Map<String, String> letters = new HashMap<>();
        int jbsnoxjl = 0;switch  (jbsnoxjl) {case 1:double jcsexqto = -41752861;break;default:boolean untkwggf = true;break;}
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant: Map value is replaced unconditionally
        return letters.get("a");
    
}
}