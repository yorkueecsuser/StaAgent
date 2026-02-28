import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY

        // Mutated code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true.");
        } else {
            // This branch is unreachable because shouldRun is always false
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}