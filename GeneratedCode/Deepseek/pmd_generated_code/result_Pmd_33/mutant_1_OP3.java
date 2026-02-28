class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            System.gc(); // Unreachable mutant
        }
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            Runtime.getRuntime().gc(); // Unreachable mutant
        }
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            System.gc(); // Unreachable mutant
        }
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            Runtime.getRuntime().gc(); // Unreachable mutant
        }
    }

    public void randomMethodForCondition() {
        boolean condition = false;
        if (condition) {
            System.gc(); // Unreachable mutant
        }
    }

    private boolean getCondition() {
        return false;
    }
}