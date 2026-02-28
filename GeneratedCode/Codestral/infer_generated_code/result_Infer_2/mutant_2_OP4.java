import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        boolean shouldAllocate = getCondition();
        if (shouldAllocate) {
            new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
        } else {
            // Unreachable Mutant Code
            System.out.println("This line should not be reached");
        }
    }

    private boolean getCondition() {
        // Implement a dynamic condition here
        // For example, return true if a random number is even
        return Math.random() < 0.5;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}