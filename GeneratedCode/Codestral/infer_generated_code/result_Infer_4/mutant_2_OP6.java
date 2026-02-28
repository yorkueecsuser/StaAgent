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
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // MUTANT: Unreachable for loop
            System.out.println("This should be unreachable");
        }
        expensiveOps.expensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    public void showBug() {
        perfCriticalOperation();
    }
}