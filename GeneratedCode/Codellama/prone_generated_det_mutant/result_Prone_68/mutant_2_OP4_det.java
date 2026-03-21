import java.util.IdentityHashMap;
import java.util.Random;

class IdentityHashMapBoxingBug {

    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        Random random = new Random();
        if (false && false && true && false && false && true && false && true && false && true && false) {short ttomuxdm = 5176;}else{byte vovnfyxi = 93;}
        int n = random.nextInt();

        map.put(n, "x");
        System.out.println(map.get(n)); // BUG: IdentityHashMapBoxing
    
}
}