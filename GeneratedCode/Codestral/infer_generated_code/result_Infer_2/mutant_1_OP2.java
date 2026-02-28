import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        Object obj1 = new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
        Object obj2 = obj1;  // Mutant: Duplicate the assignment
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}