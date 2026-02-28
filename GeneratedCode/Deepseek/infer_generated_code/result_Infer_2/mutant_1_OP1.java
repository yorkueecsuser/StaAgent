import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        String deadVariable12345678 = "DeadVariable12345678";  // MUTANT INSERTION: DEAD_STORE
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}