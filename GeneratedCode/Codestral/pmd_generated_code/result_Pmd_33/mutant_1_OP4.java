class GCCall {
    // Method to return a false condition
    private boolean shouldRunUnreachableCode() {
        return false;
    }

    public GCCall() {
        System.gc();
    }

    public void doSomething() {
        Runtime.getRuntime().gc();
        // Inserted mutant code: unreachable if-else branch
        if (shouldRunUnreachableCode()) {
            // This code is unreachable
            System.out.println("This is an unreachable code block");
        } else {
            // This else block is also unreachable
            System.out.println("This is another unreachable code block");
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
}