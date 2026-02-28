import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case to ensure switch is not empty
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch statement unreachable
        return false;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}