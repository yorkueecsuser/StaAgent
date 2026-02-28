import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    private boolean getFalseCondition() {
        return false;
    }

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
        if (getFalseCondition()) {
            System.out.println("This line will never be executed");
        }
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}