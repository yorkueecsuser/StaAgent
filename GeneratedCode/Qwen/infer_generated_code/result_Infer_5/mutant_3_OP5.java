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
        switch(condition) {
            case true:
                // This case is intentionally left empty to demonstrate the unreachable switch
                break;
        }
    }

    public void showBug() {
        foo();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}