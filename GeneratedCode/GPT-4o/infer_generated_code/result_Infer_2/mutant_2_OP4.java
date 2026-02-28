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

        // Inserting an unreachable if-else statement
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            // This block is unreachable
            System.out.println("This code is unreachable.");
        } else {
            // Continue executing normally
            System.out.println("Executing normal flow.");
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Helper method to simulate a condition that returns false
    private boolean getFalseCondition() {
        return false;
    }
}