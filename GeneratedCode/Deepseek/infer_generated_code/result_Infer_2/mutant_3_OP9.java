import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    public void replaceLoopWithDoWhile() {
        int i = 0;
        do {
            directlyAllocatingMethod();
            i++;
        } while (i < 10);
    }
}