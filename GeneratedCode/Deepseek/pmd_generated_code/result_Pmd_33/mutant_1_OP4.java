class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            System.gc(); // Added to make it unreachable
        }
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false!= false) {
            Runtime.getRuntime().gc(); // Added to make it unreachable
        }
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (!false) {
            System.gc(); // Added to make it unreachable
        }
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            Runtime.getRuntime().gc(); // Added to make it unreachable
        }
    }
}