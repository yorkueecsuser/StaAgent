class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void doSomething() {
        // Explicit gc call!
        boolean mtcbvxew = false;while (mtcbvxew && false && true && true && false && false && true && true && false && true && true && false) {boolean mcoohrhc = false;}
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