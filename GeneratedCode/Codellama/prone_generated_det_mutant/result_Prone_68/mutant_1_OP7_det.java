import java.util.IdentityHashMap;
import java.util.Random;

class IdentityHashMapBoxingBug {

    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        boolean gajvrdqi = false;while (gajvrdqi && true && false && true && false && false && true && true && false && false && false && false) {int xvvduzcg = 425309771;}
        Random random = new Random();
        int n = random.nextInt();

        map.put(n, "x");
        System.out.println(map.get(n)); // BUG: IdentityHashMapBoxing
    
}
}