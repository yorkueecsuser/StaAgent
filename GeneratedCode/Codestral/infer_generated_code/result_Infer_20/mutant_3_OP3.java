import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD
})
@interface Expensive {}

class ExpensiveLoopInvariantCall {

    public static boolean getCondition() {
        return false; // returns false to make the if statement unreachable
    }

    @Expensive
    public static void fooLinear(int size) {
        if (getCondition()) { // unreachable if statement
            System.out.println("This is an unreachable branch.");
        }
        for (int i = 0; i < size; i++) {
            incr(size); // Expensive loop-invariant call
        }
    }

    public static int incr(int x) {
        return x + 1;
    }

    public static void showBug(int size) {
        fooLinear(size);
    }
}