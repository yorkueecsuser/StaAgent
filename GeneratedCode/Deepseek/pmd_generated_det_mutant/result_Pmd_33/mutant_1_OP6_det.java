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
        for  (int rzfceokj = 0; rzfceokj < 0; rzfceokj++) {short yuwvpnnk = -3084;}
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    
}
}