import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        char eoxiljwy = 'k';
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}