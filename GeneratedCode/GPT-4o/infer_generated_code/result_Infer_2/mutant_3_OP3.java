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
        
        // Unreachable if statement mutation
        boolean condition = evaluateCondition(); // this ensures it's not a compile-time constant
        if (condition) {
            System.out.println("This will never be reached.");
        }
    }
    
    // Method to simulate runtime condition evaluation
    private boolean evaluateCondition() {
        return false;
    }
}