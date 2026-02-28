import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY

        // Mutant code: Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true.");
        } else {
            // This branch is unreachable because shouldRun is always false
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}