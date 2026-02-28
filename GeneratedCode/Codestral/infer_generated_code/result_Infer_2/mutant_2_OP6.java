import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        boolean shouldRun = false; // Always false to make the loop unreachable
        for (int i = 0; shouldRun; i++) { // Unreachable for loop
            System.out.println("This line is unreachable");
        }
        new Object();  // Original line
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}