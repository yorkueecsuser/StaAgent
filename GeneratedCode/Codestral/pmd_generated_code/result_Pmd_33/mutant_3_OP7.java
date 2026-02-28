class GCCall {
    public GCCall() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
        // Mutant: Unreachable while loop
        boolean condition = getUnreachableCondition();
        while (condition) {
            // This code block will never execute
        }
    }

    public void doSomething() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
        // Mutant: Unreachable while loop
        boolean condition = getUnreachableCondition();
        while (condition) {
            // This code block will never execute
        }
    }

    public void explicitGCcall() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.runFinalization();
        // Mutant: Unreachable while loop
        boolean condition = getUnreachableCondition();
        while (condition) {
            // This code block will never execute
        }
    }

    public void showBug() {
        // Trigger garbage collection by creating a large object
        Object[] largeArray = new Object[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new Object();
        }

        // Explicit gc call (intended bug)
        System.gc();

        // Try to free resources explicitly (intended bug)
        System.runFinalization();

        // Call gc() on Runtime object (intended bug)
        Runtime.getRuntime().gc();
        // Mutant: Unreachable while loop
        boolean condition = getUnreachableCondition();
        while (condition) {
            // This code block will never execute
        }
    }

    // Helper method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false; // This will always return false, making the loop unreachable
    }
}