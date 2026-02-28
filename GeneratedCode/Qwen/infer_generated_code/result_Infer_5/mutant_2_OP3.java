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
            // Unreachable code due to condition always being false
            System.out.println("This is an unreachable if statement.");
        }
    }

    public void showBug() {
        foo();
    }

    private boolean getCondition() {
        return false;
    }
}