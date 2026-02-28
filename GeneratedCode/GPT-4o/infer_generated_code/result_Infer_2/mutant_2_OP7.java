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
        
        // Introduce an unreachable while loop
        boolean conditionWhile = determineCondition();
        while (conditionWhile) {
            // This block will never execute
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Method to get a dynamic condition (always returns false)
    private boolean determineCondition() {
        return false;
    }
}