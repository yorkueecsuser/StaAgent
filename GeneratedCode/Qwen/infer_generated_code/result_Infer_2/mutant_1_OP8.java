import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    // Mutant: Renaming the method 'directlyAllocatingMethod' to 'a'
    @NoAllocation
    void a() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
        // Calling the mutant method to ensure no unreachable statement error
        a();
    }
}