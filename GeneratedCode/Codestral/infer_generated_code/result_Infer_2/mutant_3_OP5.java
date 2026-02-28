import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY

        // Mutant code: unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This case will never be reached
                    System.out.println("Unreachable switch case");
                    break;
            }
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}