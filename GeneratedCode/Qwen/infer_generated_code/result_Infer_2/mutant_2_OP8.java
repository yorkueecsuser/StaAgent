import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        Object obj = new Object(); // Introduced a user-defined variable 'obj'
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    // Mutated method with renamed variable
    @NoAllocation
    void directlyAllocatingMethodMutant() {
        Object a = new Object(); // Renamed 'obj' to 'a'
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
        directlyAllocatingMethodMutant(); // Calling the mutated method
    }
}