import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        boolean rhipdglo = false;
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}