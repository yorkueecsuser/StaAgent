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
    ExpensiveOperations a = expensiveOps; // Mutant: Renamed variable

    @PerformanceCritical
    public void perfCriticalOperation() {
        a.expensiveOperation(); // Mutant: Using the renamed variable
    }

    public void showBug() {
        perfCriticalOperation();
    }
}