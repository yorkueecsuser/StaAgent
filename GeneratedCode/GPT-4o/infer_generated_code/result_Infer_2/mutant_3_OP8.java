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
    }
}

// Mutant Code
class MemoryAllocationExampleMutant {

    @NoAllocation
    public void a() { // Renamed method from directlyAllocatingMethod to a
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void b() { // Renamed method from showBug to b
        a(); // Updated call to the renamed method
    }
}