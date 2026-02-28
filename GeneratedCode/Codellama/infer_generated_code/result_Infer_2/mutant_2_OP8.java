import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    @NoAllocation
    void renamedMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }
}