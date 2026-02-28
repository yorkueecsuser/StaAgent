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

        // Unreachable if statement mutation
        boolean condition = getFalseCondition(); // This method always returns false
        if (condition) {
            System.out.println("This code is unreachable due to the false condition.");
        }
    }

    // Helper method to return false, ensuring the condition is determined at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}