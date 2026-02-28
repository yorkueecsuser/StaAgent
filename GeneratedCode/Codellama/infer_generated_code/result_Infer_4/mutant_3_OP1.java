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

    // Dead Store Mutant
    void deadStore() {
        int xyz = 10;
    }
}