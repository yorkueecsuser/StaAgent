import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        String abcdefgh = "test";
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }
}