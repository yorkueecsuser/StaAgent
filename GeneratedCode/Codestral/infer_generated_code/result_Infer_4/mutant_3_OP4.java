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
        boolean shouldCallExpensiveMethod = getCondition();
        if (shouldCallExpensiveMethod) {
            // This branch is unreachable as getCondition() always returns false
            expensiveOps.expensiveOperation();
        } else {
            // This is the reachable branch
            System.out.println("Unreachable branch executed");
        }
    }

    public void showBug() {
        perfCriticalOperation();
    }

    private boolean getCondition() {
        return false;
    }
}