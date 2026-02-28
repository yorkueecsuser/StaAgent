class GCCall {
    public GCCall() {
        System.gc();
    }

    public void doSomething() {
        Runtime.getRuntime().gc();
    }

    public void explicitGCcall() {
        System.runFinalization();
    }

    // Method to return a constant false value
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        Object[] largeArray = new Object[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new Object();
        }

        // Unreachable while loop
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            System.out.println("This line will never execute");
        }

        System.gc();
        System.runFinalization();
        Runtime.getRuntime().gc();
    }
}