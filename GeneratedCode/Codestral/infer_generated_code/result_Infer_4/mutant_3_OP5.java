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
        // Original code
        expensiveOps.expensiveOperation();

        // Added mutant code
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This line will never be executed");
                break;
        }
    }

    public void showBug() {
        perfCriticalOperation();
    }

    // Method to dynamically determine the value used in the switch statement
    private int getValue() {
        return 0;  // Always return a value that is not 1 to make the switch block unreachable
    }
}