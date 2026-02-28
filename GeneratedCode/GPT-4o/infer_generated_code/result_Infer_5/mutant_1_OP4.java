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
        
        // Unreachable if-else statement mutation
        boolean condition = generateFalseCondition();
        if(condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the else branch of the unreachable if-else.");
        }
    } // BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED

    public void showBug() {
        foo();
    }

    // Method to simulate a condition that returns false
    private boolean generateFalseCondition() {
        return false;
    }
}