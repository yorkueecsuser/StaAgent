import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Mutant: Unreachable for loop
            System.out.println("This line is unreachable");
        }
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public boolean getCondition() { // Helper method to dynamically determine the condition
        return false;
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}