import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        // Dead Store Mutation
        String qjvhtyfn = "unusedVariable";
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}