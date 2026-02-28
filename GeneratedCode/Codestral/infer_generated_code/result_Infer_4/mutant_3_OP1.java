import java.lang.annotation.*;
import java.util.Random;

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
        // Dead Store Mutation
        int deadStoreVariable = new Random().nextInt();

        expensiveOps.expensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    public void showBug() {
        perfCriticalOperation();
    }
}