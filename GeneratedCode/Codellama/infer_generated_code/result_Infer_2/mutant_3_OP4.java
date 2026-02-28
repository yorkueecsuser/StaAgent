import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        boolean shouldAllocate = false;
        if (shouldAllocate) {
            new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        } else {
            // Do nothing
        }
    }
}