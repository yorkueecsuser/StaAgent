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
        expensiveOps.expensiveOperation();
        // Mutant: Duplicating the expensive operation
        // Note: This is a simulated mutation without actual side effect,
        // as per the requirement of the 'Duplication' Mutation Operator.
        expensiveOps.expensiveOperation();
    }

    public void showBug() {
        perfCriticalOperation();
    }
}