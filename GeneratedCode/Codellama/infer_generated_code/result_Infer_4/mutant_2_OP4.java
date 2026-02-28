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
    }

    @Expensive
    void expensive() {}
}

class B {
    @PerformanceCritical
    void perfCritical() {
        if (getCondition()) { // Unreachable if-else statement added
            return;
        } else {
            expensive();
        }
    }

    boolean getCondition() {
        // This method returns a non-final variable, ensuring
        // that the condition is dynamically determined at runtime.
        return false;
    }

    @Expensive
    void expensive() {}
}