import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() { // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
        }
        // Unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // This block is unreachable because isUnreachable() always returns false
        }
    }

    public void showBug() {
        foo();
    }

    private boolean getCondition() {
        return true; // This can be any logic that determines the condition at runtime
    }

    private boolean isUnreachable() {
        return false; // This method always returns false, making the if block unreachable
    }
}