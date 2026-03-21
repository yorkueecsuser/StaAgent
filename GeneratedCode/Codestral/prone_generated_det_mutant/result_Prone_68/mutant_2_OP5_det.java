import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Random;

class IdentityHashMapBoxingBug {
    private static final Random RAND = new Random();

    public static Integer randomInt() {
        return RAND.nextInt(1000);
    }

    public static Object showBug() {
        Map<Integer, String> map = new IdentityHashMap<>();
        int n = randomInt();
        int vvgrcrmp = 0;switch  (vvgrcrmp) {case 1:short nxanrlrt = 8867;break;default:String oblwtidk = "eyaqehmq";break;}
        map.put(n, "value"); // BUG: IdentityHashMapBoxing
        return map.get(n); // This could be null since boxing happens twice and could produce distinct values.
    
}

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}