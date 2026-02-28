class GCCall {
    public GCCall() {
        System.gc();
    }

    public void doSomething() {
        // Original code
        Runtime.getRuntime().gc();

        // Mutant code
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This branch is unreachable.");
        }
    }

    public void explicitGCcall() {
        System.runFinalization();
    }

    public void showBug() {
        Object[] largeArray = new Object[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new Object();
        }

        System.gc();
        System.runFinalization();
        Runtime.getRuntime().gc();
    }

    // Helper method to determine the condition for the unreachable if statement
    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }
}