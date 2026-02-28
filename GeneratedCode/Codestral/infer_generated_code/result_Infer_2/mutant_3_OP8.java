import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        Object obj = new Object();  // Added a new user-defined variable
        Object a = obj; // Mutated code: Renaming the variable 'obj' to 'a'
        // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}