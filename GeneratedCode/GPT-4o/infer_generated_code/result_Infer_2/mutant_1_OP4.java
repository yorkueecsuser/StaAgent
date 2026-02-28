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
@interface NoAllocation {}

class MemoryAllocationExample {

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY

        // Begin of unreachable if-else statement
        // Using a dynamically determined condition to avoid compile-time constant
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never print because the condition is always false.");
        } else {
            // Original logic continues unaffected
        }
        // End of unreachable if-else statement
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }
}