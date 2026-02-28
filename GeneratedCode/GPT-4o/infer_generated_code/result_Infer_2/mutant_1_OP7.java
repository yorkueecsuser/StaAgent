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

        // Inserted unreachable while loop mutant
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed");
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Helper method to ensure the while loop condition is dynamically determined
    private boolean getUnreachableCondition() {
        return false;
    }
}