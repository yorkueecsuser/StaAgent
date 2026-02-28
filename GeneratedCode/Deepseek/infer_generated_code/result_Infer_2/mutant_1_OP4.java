import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
        if (getCondition()) {  // Additional mutant line
            // Code here will not be executed
        } else {
            throw new Error("Unreachable code");
        }
    }

    private boolean getCondition() {  // Additional mutant method
        return false;
    }
}