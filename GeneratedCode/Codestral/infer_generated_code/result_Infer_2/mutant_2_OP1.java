import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        int mUt4T3dP = 0; // Newly added dead store
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}