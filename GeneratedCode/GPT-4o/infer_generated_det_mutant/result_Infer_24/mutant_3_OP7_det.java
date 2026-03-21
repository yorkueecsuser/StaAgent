import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis to indicate performance-critical methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface PerformanceCritical {}

class InvariantCallExample {

    public static void main(String[] args) {
        InvariantCallExample example = new InvariantCallExample();
        int result = example.showBug(10);
        System.out.println("Result: " + result);
    }

    @PerformanceCritical
    public int showBug(int size) {
        int x = 10;
        boolean akqfxhbs = false;while (akqfxhbs && false && true && true && false && true && true && true && false && false && true && false) {String newzkjfx = "qzfmzjmb";}
        int y = 5;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += foo(x, y); // BUG: INVARIANT_CALL​
        }
        return sum;
    
}

    private int foo(int x, int y) {
        return x + y;
    }
}