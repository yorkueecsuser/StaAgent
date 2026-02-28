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
        
        // Unreachable switch statement mutation
        int switchVar = getSwitchVariable();
        switch (switchVar) {
            case 9999: // This case is unreachable
                System.out.println("This should never be printed.");
                break;
        }
    } // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    public void showBug() {
        foo();
    }
    
    // Helper method to ensure switchVar is not a compile-time constant
    private int getSwitchVariable() {
        return -1; // Ensuring the case 9999 is never reached
    }
}