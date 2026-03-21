import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Random;

class IdentityHashMapBoxingBug {
    private static final Random RAND = new Random();

    public static Integer randomInt() {
        return RAND.nextInt(1000);
    }
public static Object showBug() {
    Map < Integer , String > map = new IdentityHashMap < >();
    int n = randomInt();
    n = randomInt();
    map.put(n , "value");
    return map.get(n);
}

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}