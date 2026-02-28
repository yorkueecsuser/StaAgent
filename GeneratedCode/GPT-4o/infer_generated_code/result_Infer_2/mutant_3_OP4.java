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

        // Inserted unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("Unreachable code");
        } else {
            // Normal flow continues here
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Helper method to simulate a condition that always returns false at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
}