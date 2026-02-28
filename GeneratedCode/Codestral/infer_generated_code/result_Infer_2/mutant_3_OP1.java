import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        int unusedVar = 5; // Mutated code: Dead Store
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}