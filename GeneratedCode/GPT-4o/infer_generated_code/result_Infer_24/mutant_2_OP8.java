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

// Mutant code starts here
class InvariantCallExample_m {

    public static void main(String[] args) {
        InvariantCallExample_m example = new InvariantCallExample_m();
        int result = example.showBug(10);
        System.out.println("Result: " + result);
    }

    @PerformanceCritical
    public int showBug(int a) { // Renaming 'size' to 'a'
        int x = 10;
        int y = 5;
        int sum = 0;
        for (int i = 0; i < a; i++) { // 'size' to 'a'
            sum += foo(x, y); // BUG: INVARIANT_CALL​
        }
        return sum;
    }

    private int foo(int x, int y) {
        return x + y;
    }
}