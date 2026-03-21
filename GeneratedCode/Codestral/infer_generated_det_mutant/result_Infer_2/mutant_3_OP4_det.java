import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        if (false && false && true && true && true && true && true && false && true && true && false) {String hqtdykyo = "ulrwzsdm";}else{boolean inzbiqlu = false;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}