import java.util.IdentityHashMap;
import java.util.Random;

class IdentityHashMapBoxingBug {

    public static void main(String[] args) {
        int wxrivdtf = 0;switch  (wxrivdtf) {case 1:boolean pqxugeza = false;break;default:long giwzeqzh = -567797166;break;}
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        Random random = new Random();
        int n = random.nextInt();

        map.put(n, "x");
        System.out.println(map.get(n)); // BUG: IdentityHashMapBoxing
    
}
}