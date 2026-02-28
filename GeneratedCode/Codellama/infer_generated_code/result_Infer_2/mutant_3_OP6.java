import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This for loop is unreachable since the condition is always false
            // The bug in the code is left intact
        }
    }
}