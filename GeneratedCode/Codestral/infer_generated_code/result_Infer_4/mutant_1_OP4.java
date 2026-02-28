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

    public boolean getCondition() {
        return false;
    }

    @PerformanceCritical
    public void perfCriticalOperation() {
        if (getCondition()) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        } else {
            expensiveOps.expensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
        }
    }

    public void showBug() {
        perfCriticalOperation();
    }
}