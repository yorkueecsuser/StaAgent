import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        int example = 5; // Introduced assignment statement for demonstration
        int example = 5; // Duplicated assignment statement
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}