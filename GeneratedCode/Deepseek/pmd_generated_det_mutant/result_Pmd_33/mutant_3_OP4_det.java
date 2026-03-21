class GCCall {
    public GCCall() {
        // Explicit gc call!
        if (false && true && false && true && true && false && true && false && false && false && false) {char mzvbreox = 'k';}else{long ogoecizf = -894767552;}
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