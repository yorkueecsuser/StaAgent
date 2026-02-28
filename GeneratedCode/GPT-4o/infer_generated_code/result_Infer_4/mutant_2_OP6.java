import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis to indicate performance critical methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface PerformanceCritical {}

/**
 * Marker annotation used for static analysis to indicate expensive methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

class ExpensiveMethodExample {

    @PerformanceCritical
    public void computeResult() {
        performExpensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

        // Adding an unreachable for loop using a dynamic condition
        boolean isUnreachable = determineUnreachability();
        for (int i = 0; isUnreachable; i++) {
            // This block will never execute
            System.out.println("This loop is unreachable.");
        }
    }

    private boolean determineUnreachability() {
        // Return a dynamic value that is always false
        return false;
    }

    @Expensive
    public void performExpensiveOperation() {
        // Simulate an expensive operation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public String showBug() {
        computeResult();
        return "Bug demonstrated by calling an expensive method from a performance critical one.";
    }

    public static void main(String[] args) {
        ExpensiveMethodExample example = new ExpensiveMethodExample();
        System.out.println(example.showBug());
    }
}