import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY

        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block will never be executed
            System.out.println("Unreachable code");
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    private boolean getCondition() {
        // Replace this with the actual condition for the while loop
        return false;
    }
}