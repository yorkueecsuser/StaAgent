import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY

        // Mutated code: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will also never execute because the if condition is always false
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        // Always return false to ensure the if-else branches are unreachable
        return false;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}