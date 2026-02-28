import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
        new Object();  // Mutant: Duplicated the allocation statement
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}