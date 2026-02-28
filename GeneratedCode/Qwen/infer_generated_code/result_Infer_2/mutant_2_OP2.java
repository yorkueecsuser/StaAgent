import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        int example = 42; // Introduced assignment statement for duplication
        int example = 42; // Duplicated assignment statement
        directlyAllocatingMethod();
    }
}