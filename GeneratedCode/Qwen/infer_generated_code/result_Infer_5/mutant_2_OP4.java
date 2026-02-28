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
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that might run
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable else block.");
        }
    }

    public void showBug() {
        foo();
    }

    private boolean getCondition() {
        return true; // This method ensures the condition is dynamically determined at runtime
    }
}