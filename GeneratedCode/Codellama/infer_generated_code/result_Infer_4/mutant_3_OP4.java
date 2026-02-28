import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD,
    ElementType.FIELD,
    ElementType.CONSTRUCTOR,
    ElementType.PARAMETER
})
@interface PerformanceCritical {}

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD,
    ElementType.FIELD,
    ElementType.CONSTRUCTOR,
    ElementType.PARAMETER
})
@interface Expensive {}

class A {
    @PerformanceCritical
    void perfCritical() {
        expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

        // MUTANT: Insert unreachable if-else statement
        if (getCondition()) {
            // Do nothing
        } else {
            System.out.println("Unreachable code executed");
        }
    }

    @Expensive
    void expensive() {}

    // Helper method to avoid compile-time constant condition
    boolean getCondition() {
        return Math.random() > 0.5;
    }
}