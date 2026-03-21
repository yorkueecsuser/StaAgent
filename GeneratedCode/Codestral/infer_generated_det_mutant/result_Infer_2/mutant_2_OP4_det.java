import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        if (true && false && true && false && true && true && false && false && true && true && false) {int jdfouyzy = -62851327;}else{int xtzgifun = -52523999;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}