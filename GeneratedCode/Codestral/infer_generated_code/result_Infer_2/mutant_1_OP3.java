import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    private boolean getCondition() {
        return false;
    }

    @NoAllocation
    public void directlyAllocatingMethod() {
        if (getCondition()) {
            // Unreachable code
            new Object();
        }
        // BUG: CHECKERS_ALLOCATES_MEMORY
        new Object();
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}