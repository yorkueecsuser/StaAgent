import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        renamed_method();
    }

    @NoAllocation
    void renamed_method() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }
}