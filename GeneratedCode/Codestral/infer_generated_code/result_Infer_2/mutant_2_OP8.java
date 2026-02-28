import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        Object a = new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
        // Mutant: Renaming the variable 'a' to 'b'
        Object b = a;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}