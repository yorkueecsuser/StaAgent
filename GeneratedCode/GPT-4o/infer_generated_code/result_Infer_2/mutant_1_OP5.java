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
    }

    public void showBug() {
        directlyAllocatingMethod();
        
        // Unreachable switch statement mutation added here
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be hit
                System.out.println("Unreachable case");
                break;
            default:
                // Do nothing
                break;
        }
    }
    
    // Method to ensure the switch condition is not a compile-time constant
    private int getUnreachableValue() {
        return -1; // This ensures the switch statement is not entered
    }
}