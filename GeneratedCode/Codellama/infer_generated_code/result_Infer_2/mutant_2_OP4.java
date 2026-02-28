import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    void unreachableIfElseBranch() {
        boolean condition = getCondition();
        if (condition) {
            // code
        } else {
            // code
        }
    }
}