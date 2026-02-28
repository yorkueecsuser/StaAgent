class GCCall {
    String a1234567; // a random string of eight characters

    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        a1234567 = "A string"; // This is the Dead Store Mutator
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        a1234567 = "A string"; // This is the Dead Store Mutator
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        a1234567 = "A string"; // This is the Dead Store Mutator
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        a1234567 = "A string"; // This is the Dead Store Mutator
    }
}