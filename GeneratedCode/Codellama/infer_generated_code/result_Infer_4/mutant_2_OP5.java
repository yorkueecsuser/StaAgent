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
    void expensive() {
        // Add unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1: // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
                // code
                break;
            default:
                // code
                break;
        }
    }

    private int getValue() {
        // Always returns 0 to ensure unreachable switch statement
        return 0;
    }
}