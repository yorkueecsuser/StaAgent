import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
        int deadStoreVar; // Mutant: Dead Store
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}