import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    @NoAllocation
    void duplicatedMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }
}