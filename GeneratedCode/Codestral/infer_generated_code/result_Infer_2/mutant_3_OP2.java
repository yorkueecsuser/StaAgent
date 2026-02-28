import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        new Object();  // original line
        new Object();  // mutant line: duplicate the original line
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}