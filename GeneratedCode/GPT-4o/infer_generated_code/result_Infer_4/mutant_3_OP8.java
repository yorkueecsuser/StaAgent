import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis to indicate performance critical methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface PerformanceCritical {}

/**
 * Marker annotation used for static analysis to indicate expensive methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

class ExpensiveMethodExample {

    @PerformanceCritical
    public void computeResult() {
        performExpensiveOperation(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }

    @Expensive
    public void performExpensiveOperation() {
        // Simulate an expensive operation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public String showBug() {
        computeResult();
        return "Bug demonstrated by calling an expensive method from a performance critical one.";
    }

    public static void main(String[] args) {
        ExpensiveMethodExample example = new ExpensiveMethodExample();
        System.out.println(example.showBug());
    }
}

// Mutant code with renamed variable
class ExpensiveMethodExampleMutant {

    @PerformanceCritical
    public void a() { // Renamed method from computeResult to a
        b(); // Renamed method call from performExpensiveOperation to b
    }

    @Expensive
    public void b() { // Renamed method from performExpensiveOperation to b
        // Simulate an expensive operation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public String c() { // Renamed method from showBug to c
        a(); // Renamed method call from computeResult to a
        return "Bug demonstrated by calling an expensive method from a performance critical one.";
    }

    public static void main(String[] args) {
        ExpensiveMethodExampleMutant exampleMutant = new ExpensiveMethodExampleMutant();
        System.out.println(exampleMutant.c()); // Renamed method call from showBug to c
    }
}