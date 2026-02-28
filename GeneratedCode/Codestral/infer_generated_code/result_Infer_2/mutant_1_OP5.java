import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    // Method to return false for making the switch unreachable
    private boolean getFalseCondition() {
        return false;
    }

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY

        // Mutant code: Unreachable switch statement
        boolean condition = getFalseCondition();
        switch (condition? 1 : 0) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code");
                break;
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}