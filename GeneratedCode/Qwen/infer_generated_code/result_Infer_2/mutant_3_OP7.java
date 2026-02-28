import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    private boolean getCondition() {
        return false;
    }
}