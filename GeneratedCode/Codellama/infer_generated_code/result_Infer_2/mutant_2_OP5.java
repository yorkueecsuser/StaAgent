import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        boolean condition = getCondition();
        switch (condition) {
            case false:
                // unreachable code
                new Object();
                break;
            default:
                // do nothing
        }
    }

    private boolean getCondition() {
        // random method to generate a boolean value
        return Math.random() < 0.5;
    }
}