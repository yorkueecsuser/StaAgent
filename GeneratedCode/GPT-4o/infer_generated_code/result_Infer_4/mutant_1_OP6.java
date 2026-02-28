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

        // Introduce a method to provide a condition for the unreachable for loop
        boolean conditionForLoop = getConditionForLoop();

        // Unreachable for loop
        for (int i = 0; conditionForLoop; i++) {
            // This block will never be executed
            System.out.println("This is an unreachable for loop statement.");
        }
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

    // Method to provide a non-final variable for unreachable condition
    private boolean getConditionForLoop() {
        return false;
    }

    public static void main(String[] args) {
        ExpensiveMethodExample example = new ExpensiveMethodExample();
        System.out.println(example.showBug());
    }
}