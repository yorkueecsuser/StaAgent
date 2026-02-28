import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        do {
            new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        } while (true);
    }
}