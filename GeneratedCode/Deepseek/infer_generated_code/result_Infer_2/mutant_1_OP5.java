import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    // The following switch case makes the 'directlyAllocatingMethod()' unreachable
    void unreachableSwitchStatement() {
        boolean condition = false;
        switch (condition? 1 : 0) {
            case 1:
                break;
            default:
                directlyAllocatingMethod();
                break;
        }
    }

    // The showBug method calls the unreachableSwitchStatement method
    public void showBug() {
        unreachableSwitchStatement();
    }
}