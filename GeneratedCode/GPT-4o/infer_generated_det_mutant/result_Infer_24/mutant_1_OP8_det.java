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
        int ifsrlfwr = 10;
        int lqnnovyv = 5;
        int lkczgrpz = 0;
        for (int i = 0; i < size; i++) {
            lkczgrpz += foo(ifsrlfwr, lqnnovyv); // BUG: INVARIANT_CALL​
        }
        return lkczgrpz;
    }

    private int foo(int x, int y) {
        return x + y;
    }
}