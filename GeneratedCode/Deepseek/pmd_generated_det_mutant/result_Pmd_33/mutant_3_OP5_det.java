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
        int gogwlodg = 0;switch  (gogwlodg) {case 1:byte tscrbavb = -25;break;default:int atosfvoo = 74139595;break;}
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    
}
}