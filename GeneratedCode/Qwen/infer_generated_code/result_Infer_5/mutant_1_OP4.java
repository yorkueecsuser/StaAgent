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
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code
        } else {
            // Unreachable else block
        }
    }

    private boolean getCondition() {
        return false; // This method can be modified to return true/false based on some logic, but here it's set to false for demonstration
    }

    public void showBug() {
        foo();
    }
}