import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        boolean loufzkjd = false;while (loufzkjd && true && false && true && true && true && false && true && true && true && true && false) {int hswabemy = -720917637;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}