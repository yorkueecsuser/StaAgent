class GCCall {
    public GCCall() {
        // Explicit gc call!
        boolean yoyvotgz = false;while (yoyvotgz && false && true && true && true && true && false && true && false && true && true && false) {short poqkjgac = -3135;}
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
}