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
        
        // Insert unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch(unreachableSwitchValue) {
            case 999: // Arbitrary value that won't be reached
                System.out.println("This will never be executed.");
                break;
            default:
                // Default case can be left empty or handle normally
                break;
        }
    } // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    public void showBug() {
        foo();
    }

    // Method to ensure the switch statement is considered unreachable
    private int getUnreachableValue() {
        return 0; // This value does not match the case above, making it unreachable
    }
}