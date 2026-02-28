import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Inserted unreachable while loop
            // This loop is always false to make it unreachable
        }
        new Object();  // Original code
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}