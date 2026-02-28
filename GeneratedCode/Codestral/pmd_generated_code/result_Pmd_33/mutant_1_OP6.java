class GCCall {
    public GCCall() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();
    }

    public void doSomething() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();
    }

    public void explicitGCcall() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.runFinalization();
    }

    public void showBug() {
        // Trigger garbage collection by creating a large object
        Object[] largeArray = new Object[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new Object();
        }

        // Explicit gc call (intended bug)
        System.gc();

        // Adding an unreachable for loop after the first explicit garbage collection call
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as the condition is always false
            System.out.println("This line should never be executed.");
        }

        // Try to free resources explicitly (intended bug)
        System.runFinalization();

        // Call gc() on Runtime object (intended bug)
        Runtime.getRuntime().gc();
    }

    // Method to determine the loop condition dynamically
    private boolean getCondition() {
        return false;  // Always return false to make the loop unreachable
    }
}