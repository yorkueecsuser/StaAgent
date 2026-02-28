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

        // Unreachable switch statement insertion
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // Unique case that should never be hit
                System.out.println("This code is unreachable.");
                break;
            default:
                break;
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // Ensures that the case 999 is never matched
    }
}