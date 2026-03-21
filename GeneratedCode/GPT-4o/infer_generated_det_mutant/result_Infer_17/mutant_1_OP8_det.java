import java.lang.annotation.*;
import java.util.Random;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
@interface ThreadSafe {}

@ThreadSafe
class IntegerOverflowExample {

    public static int getUnknownValue() {
        // Simulate unknown method
        return new Random().nextInt(Integer.MAX_VALUE);
    }

    public int showBug() {
        int ddktltplxxwlubd = getUnknownValue();
        int ltplxxwl = ddktltplxxwlubd + 2000000000; // BUG: INTEGER_OVERFLOW_L2​
        int[] yjvawxtb = new int[10];
        return yjvawxtb[Math.abs(ltplxxwl % 10)];
    }

    public static void main(String[] args) {
        IntegerOverflowExample obj = new IntegerOverflowExample();
        System.out.println(obj.showBug());
    }
}