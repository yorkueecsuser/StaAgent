import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code will never execute
            System.out.println("This is an unreachable branch");
        } else {
            // This is the actual branch that will execute
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}