import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            directlyAllocatingMethod();
        }
        else {
            // This is an unreachable statement to avoid unreachable statement error
            System.out.println("This statement is unreachable");
        }
    }

    private boolean getCondition() {
        return false;
    }
}