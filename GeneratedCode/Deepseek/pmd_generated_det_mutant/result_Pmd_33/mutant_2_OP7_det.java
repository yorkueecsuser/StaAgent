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
        boolean qflffvaf = false;while (qflffvaf && true && true && false && true && true && true && false && false && true && false && false) {char gteiqhlk = 'h';}
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    
}

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }
}