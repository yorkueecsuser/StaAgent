import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void a() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        a();
    }
}