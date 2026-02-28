import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        int exampleVariable = 42; // Introduced assignment statement for mutation
        int exampleVariable = 42; // Duplicated assignment statement
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}