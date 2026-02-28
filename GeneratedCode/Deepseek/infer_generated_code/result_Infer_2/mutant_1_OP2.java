import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
        new Object();  // Mutant: Duplicated the statement
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}