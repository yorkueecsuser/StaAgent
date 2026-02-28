import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        if (false) {
            new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        }
    }
}