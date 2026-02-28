import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() { 
        // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
    }

    public void showBug() {
        foo();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}