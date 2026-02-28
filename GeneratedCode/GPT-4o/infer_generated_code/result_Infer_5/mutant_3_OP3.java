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

        // Inserting an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        }
    } // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    private boolean getUnreachableCondition() {
        return false; // This method can be more complex in reality to mimic dynamic evaluation
    }

    public void showBug() {
        foo();
    }
}