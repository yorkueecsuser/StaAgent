class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void duplicateGCCall() {
        // Explicit gc call in duplicate method!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }
}