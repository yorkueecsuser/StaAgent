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
            // Unreachable else branch
            System.out.println("This is an unreachable else branch.");
        }
    }

    public void showBug() {
        foo();
    }

    private boolean getCondition() {
        return true; // This ensures the condition is dynamically determined at runtime
    }
}