import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable while loop inserted
        }
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    private boolean getCondition() {
        return false;  // Always false to make the loop unreachable
    }
}