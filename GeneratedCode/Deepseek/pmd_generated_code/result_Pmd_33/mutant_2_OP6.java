class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        // Unreachable for loop
        for(int i = 0; false; i++) {
            // Empty block
        }
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        // Unreachable for loop
        for(int i = 0; false; i++) {
            // Empty block
        }
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        // Unreachable for loop
        for(int i = 0; false; i++) {
            // Empty block
        }
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        // Unreachable for loop
        for(int i = 0; false; i++) {
            // Empty block
        }
    }
}