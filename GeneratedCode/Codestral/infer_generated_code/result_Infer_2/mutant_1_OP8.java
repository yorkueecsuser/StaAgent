import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        Object a = new Object();  // Mutant: Renamed 'Object' instance to 'a'
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}