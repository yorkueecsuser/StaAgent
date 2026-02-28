import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        boolean isUnreachable = false;
        if (isUnreachable) {
            new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        }
    }
}