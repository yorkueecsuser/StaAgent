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
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Mutant code: Unreachable if statement
            expensiveOps.expensiveOperation();
        }
        expensiveOps.expensiveOperation(); // Original code
    }

    public boolean getUnreachableCondition() {
        // This method should always return false to make the if statement unreachable
        return false;
    }

    public void showBug() {
        perfCriticalOperation();
    }
}