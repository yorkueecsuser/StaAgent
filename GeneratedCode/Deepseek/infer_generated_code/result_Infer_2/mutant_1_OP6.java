import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    void unreachableForLoop() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // unreachable code
            if (i > 100) {
                break;
            }
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
        unreachableForLoop();
    }

    boolean getCondition() {
        return false;
    }
}