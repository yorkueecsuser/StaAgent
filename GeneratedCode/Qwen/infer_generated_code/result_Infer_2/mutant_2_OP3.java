import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        }
    }

    private boolean getCondition() {
        // Always return false to ensure the if block is unreachable
        return false;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}