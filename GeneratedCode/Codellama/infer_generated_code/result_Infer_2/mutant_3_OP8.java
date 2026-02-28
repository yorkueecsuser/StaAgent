import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    void mutatedMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }
}