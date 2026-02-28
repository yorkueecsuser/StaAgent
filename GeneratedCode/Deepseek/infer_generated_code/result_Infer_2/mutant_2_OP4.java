import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        boolean shouldRun = true;
        if (shouldRun) {
            directlyAllocatingMethod();
        } else {
            // Unreachable else branch
            if (false) {
                System.out.println("This is an unreachable branch");
            }
        }
    }
}