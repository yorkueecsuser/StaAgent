import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        boolean mpnsltdg = false;while (mpnsltdg && false && true && true && false && false && true && false && false && true && false && false) {byte exggrovs = 17;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}