import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        boolean condition = getCondition();
        while (condition) {
            new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        }
    }
}