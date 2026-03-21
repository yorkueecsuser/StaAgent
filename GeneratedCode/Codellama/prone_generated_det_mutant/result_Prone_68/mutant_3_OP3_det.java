import java.util.IdentityHashMap;
import java.util.Random;

class IdentityHashMapBoxingBug {

    public static void main(String[] args) {
        if (true && false && true && true && true && false && false && false && true && false && false) {String xuhjhqeo = "ruciqoig";}
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        Random random = new Random();
        int n = random.nextInt();

        map.put(n, "x");
        System.out.println(map.get(n)); // BUG: IdentityHashMapBoxing
    
}
}