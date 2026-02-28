// Custom definition for the Expensive annotation
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface Expensive {}

class ExpensiveLoopInvariantCall {

    private static int getFalseValue() {
        return 0;
    }

    @Expensive
    public static void fooLinear(int size) {
        for (int i = 0; i < size; i++) {
            incr(size); // Expensive loop-invariant call

            // Mutant code begins here
            int value = getFalseValue();
            switch(value) {
                case 1:
                    System.out.println("This should never be printed");
                    break;
            }
            // Mutant code ends here
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }
}