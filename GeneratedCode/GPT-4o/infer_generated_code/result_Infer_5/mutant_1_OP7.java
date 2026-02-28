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
        // Unreachable while loop inserted here
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This block will never execute.");
        }
        
        System.out.println("Expensive operation executed.");
    } // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    private boolean getCondition() {
        // Simulate a condition that will always return false
        return false;
    }

    public void showBug() {
        foo();
    }
}