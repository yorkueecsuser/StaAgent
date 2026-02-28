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
        if (false) {
            // Unreachable code
            int x = 10;
            int y = 20;
            int z = x + y;
        }
    }

    @Expensive
    void expensive() {}
}