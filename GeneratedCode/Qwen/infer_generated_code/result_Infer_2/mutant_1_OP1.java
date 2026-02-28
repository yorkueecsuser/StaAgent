import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        // Dead Store Mutation
        String qwertyui = "unused"; // Unique dead store variable
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}