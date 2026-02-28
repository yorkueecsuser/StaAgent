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
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition? 0 : 1) {
            case 0:
                // This case is unreachable because unreachableCondition is always false
                System.out.println("This will never be printed");
                break;
            default:
                // Default case to ensure the switch is valid
                break;
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        foo();
    }
}