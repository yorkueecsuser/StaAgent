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
        boolean jnvydsac = false;while (jnvydsac && false && false && true && false && false && true && false && false && true && true && false) {int oezmznfg = 681275375;}
        performExpensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    
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