import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,        // for classes and interfaces
    ElementType.METHOD,      // for methods
    ElementType.FIELD,       // for fields
    ElementType.CONSTRUCTOR, // for constructors
    ElementType.PARAMETER    // for method parameters
})
@interface Expensive {}

interface I {
    void foo();
}

class A implements I {
    @Expensive
    public void foo() {
        System.out.println("Expensive operation executed.");
        
        // Inserting unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This case is never executed.");
                break;
            case 2:
                System.out.println("Neither is this one.");
                break;
            default:
                System.out.println("Default case, also never executed.");
                break;
        }
    } // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    public void showBug() {
        foo();
    }

    // Method to ensure non-final variable for switch condition
    private int getUnreachableSwitchValue() {
        return -1; // Always returns a value not covered by the switch cases
    }
}