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
    ExpensiveOperations x = expensiveOps; // Mutant code added

    @PerformanceCritical
    public void perfCriticalOperation() {
        x.expensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    public void showBug() {
        perfCriticalOperation();
    }
}