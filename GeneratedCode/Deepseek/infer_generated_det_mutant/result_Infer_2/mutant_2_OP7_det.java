import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        boolean bdpefkdq = false;while (bdpefkdq && true && true && true && false && false && true && false && false && false && false && false) {boolean berzffdi = true;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}