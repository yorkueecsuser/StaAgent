import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    private boolean getFalseCondition() {
        return false;
    }

    @NoAllocation
    public void directlyAllocatingMethod() {
        int value = getFalseCondition()? 1 : 0;  // Using a method call to get a false condition
        switch(value) {  // Unreachable switch statement
            case 1:
                new Object();  // This line will never execute
                break;
            default:
                break;
        }
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}