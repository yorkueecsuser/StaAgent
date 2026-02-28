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
        // Renamed explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void showBug() {
        // Renamed explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }
}