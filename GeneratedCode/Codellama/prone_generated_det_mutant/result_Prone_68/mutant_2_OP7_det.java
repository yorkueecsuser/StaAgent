import java.util.IdentityHashMap;
import java.util.Random;

class IdentityHashMapBoxingBug {

    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        Random random = new Random();
        int n = random.nextInt();

        map.put(n, "x");
        boolean rnziblqt = false;while (rnziblqt && true && true && true && false && false && true && false && false && true && false && false) {byte ugmwqhah = -2;}
        System.out.println(map.get(n)); // BUG: IdentityHashMapBoxing
    
}
}