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

// Unreachable if statement mutant
class A {
    @PerformanceCritical
    void perfCritical() {
        boolean condition = getCondition();
        if (condition) {
            expensive(); // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
        } else {
            // do nothing
        }
    }

    @Expensive
    void expensive() {}

    boolean getCondition() {
        return false;
    }
}