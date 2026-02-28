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

        // Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableSwitchCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case will never be executed.");
                break;
            default:
                // Default case does nothing
                break;
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Method to provide a non-final variable for switch condition
    private int getUnreachableSwitchCondition() {
        return 0; // Ensures the switch case remains unreachable
    }
}