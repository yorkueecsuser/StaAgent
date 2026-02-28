import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY

        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}