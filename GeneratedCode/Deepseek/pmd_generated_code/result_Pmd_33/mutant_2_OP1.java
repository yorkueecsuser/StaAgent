class GCCall {
    private String unusedString1 = "abcdefgh";

    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    private String unusedString2 = "ijklmnop";

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    private String unusedString3 = "qrstuvwx";

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    private String unusedString4 = "yzabcdef";

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }
}