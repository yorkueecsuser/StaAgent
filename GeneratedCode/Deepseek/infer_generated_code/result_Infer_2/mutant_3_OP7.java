import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    void unreachableWhileLoop() {
        boolean condition = false;
        while(condition) {
            condition = true;
        }
    }

    public void showMutant() {
        unreachableWhileLoop();
    }
}