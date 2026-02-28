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
        // Insert unreachable for loop mutant
        boolean conditionFor = getConditionForMutant();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("Unreachable for loop mutant");
        }

        expensiveOps.expensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    public void showBug() {
        perfCriticalOperation();
    }

    // Method to return false for the for loop condition
    private boolean getConditionForMutant() {
        return false;
    }
}