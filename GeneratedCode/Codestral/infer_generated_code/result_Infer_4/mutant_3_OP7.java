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
        boolean conditionWhile = getCondition();
        // Unreachable while loop mutation
        while (conditionWhile) {
            // This code will never execute, but it's been added to demonstrate the mutation
        }
        expensiveOps.expensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    public boolean getCondition() {
        // This is a placeholder method that always returns false
        // In a real-world application, this method would return a dynamically determined value
        return false;
    }

    public void showBug() {
        perfCriticalOperation();
    }
}