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
        switch (condition? 0 : 1) { // This switch will never hit case 0
            case 0:
                System.out.println("This is unreachable");
                break;
            default:
                // Default case to ensure the switch is not empty
                break;
        }
    }

    public void showBug() {
        foo();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined
    }
}