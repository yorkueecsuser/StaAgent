import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        boolean qfslmqnk = false;while (qfslmqnk && true && false && true && false && true && true && false && false && false && false && false) {byte ezfwtcur = 108;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}