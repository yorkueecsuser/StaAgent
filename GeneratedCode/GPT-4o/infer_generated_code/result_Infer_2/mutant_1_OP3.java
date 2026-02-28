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

        // Inserting an unreachable if statement
        boolean condition = getCondition(); // Ensures this is not a compile-time constant
        if (condition) {
            System.out.println("This code is unreachable.");
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Method to dynamically determine the condition at runtime
    private boolean getCondition() {
        return false; // Ensures the condition is dynamically evaluated to false
    }
}