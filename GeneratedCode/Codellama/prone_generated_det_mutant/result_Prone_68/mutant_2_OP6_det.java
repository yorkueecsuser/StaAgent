import java.util.IdentityHashMap;
import java.util.Random;

class IdentityHashMapBoxingBug {

    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        Random random = new Random();
        int n = random.nextInt();

        for  (int xmsjmmip = 0; xmsjmmip < 0; xmsjmmip++) {int lydivqrv = 578156172;}
        map.put(n, "x");
        System.out.println(map.get(n)); // BUG: IdentityHashMapBoxing
    
}
}