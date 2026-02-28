import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Expensive {}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface PerformanceCritical {}

class ExpensiveOperations {
    @Expensive
    public void expensiveOperation() {
        // Simulating an expensive operation
    }
}

class PerformanceCriticalOperations {
    ExpensiveOperations expensiveOps = new ExpensiveOperations();

    @PerformanceCritical
    public void perfCriticalOperation() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop
            // This loop is unreachable as the condition is always false
        }
        expensiveOps.expensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public void showBug() {
        perfCriticalOperation();
    }
}