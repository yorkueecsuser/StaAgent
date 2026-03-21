import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        boolean ljlqywbx = false;while (ljlqywbx && true && true && false && true && true && false && false && true && true && false && false) {String njerioxo = "duipaext";}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}