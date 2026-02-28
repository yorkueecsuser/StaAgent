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
        boolean unreachableSwitch = getUnreachableSwitchCondition();
        switch (unreachableSwitch? 1 : 0) {
            case 1:
                // Unreachable code
                break;
        }
        expensiveOps.expensiveOperation();
    }

    public void showBug() {
        perfCriticalOperation();
    }

    // Method to return false to ensure the switch statement is unreachable
    private boolean getUnreachableSwitchCondition() {
        return false;
    }
}