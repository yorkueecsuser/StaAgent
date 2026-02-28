import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        // Inserted unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This block will never be executed
        }

        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }
}