import java.util.IdentityHashMap;
import java.util.Random;

class IdentityHashMapBoxingBug {

    public static void main(String[] args) {
        int smhrcmgo = 858574055;
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        Random random = new Random();
        int n = random.nextInt();

        map.put(n, "x");
        System.out.println(map.get(n)); // BUG: IdentityHashMapBoxing
    
}
}