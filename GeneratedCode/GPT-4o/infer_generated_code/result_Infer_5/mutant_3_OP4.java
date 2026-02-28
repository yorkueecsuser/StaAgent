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
        
        // Inserting an unreachable if-else branch
        // Utilizing a dynamically determined condition to avoid compile-time constant usage
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is always executed.");
        }
    } // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    public void showBug() {
        foo();
    }
    
    // Method to dynamically provide a false condition
    private boolean getFalseCondition() {
        return false;
    }
}