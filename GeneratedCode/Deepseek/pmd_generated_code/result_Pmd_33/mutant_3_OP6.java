class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
        }
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
        }
    }

    public boolean getCondition() {
        // method to return the condition value
        return false;
    }
}