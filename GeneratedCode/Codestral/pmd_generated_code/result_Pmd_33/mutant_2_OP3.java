class GCCall {
    public GCCall() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.gc();

        // Mutant code: Unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
        }
    }

    public void doSomething() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        Runtime.getRuntime().gc();

        // Mutant code: Unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
        }
    }

    public void explicitGCcall() {
        // BUG: DoNotCallGarbageCollectionExplicitly
        System.runFinalization();

        // Mutant code: Unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
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

        // Mutant code: Unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
        }

        // Try to free resources explicitly (intended bug)
        System.runFinalization();

        // Mutant code: Unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
        }

        // Call gc() on Runtime object (intended bug)
        Runtime.getRuntime().gc();

        // Mutant code: Unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
        }
    }

    // Method to return false; used to ensure the if condition is unreachable
    private boolean getCondition() {
        return false;
    }
}