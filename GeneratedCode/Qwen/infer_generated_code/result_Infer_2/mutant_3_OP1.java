import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        String qvbnrhty = "unused"; // Dead store mutation
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}