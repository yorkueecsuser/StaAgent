import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    @NoAllocation
    void unreachableWhileLoop() {
        boolean condition = getCondition();
        while (!condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}