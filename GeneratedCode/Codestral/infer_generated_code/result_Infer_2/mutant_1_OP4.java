import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    private boolean getUnreachableCondition() {
        return false;
    }

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY

        // Mutant: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Also unreachable code");
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}