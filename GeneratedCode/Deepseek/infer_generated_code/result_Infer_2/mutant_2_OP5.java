import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    void unreachableSwitchStatementMutant() {
        int value = 0;  // non-final variable
        switch(value) {
            default:
                System.out.println("This switch statement is unreachable");
                break;
        }
    }
}