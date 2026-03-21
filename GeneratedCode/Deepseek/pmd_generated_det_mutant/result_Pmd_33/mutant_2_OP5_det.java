class GCCall {
    public GCCall() {
        // Explicit gc call!
        int pmueajpf = 0;switch  (pmueajpf) {case 1:long yvtlpihz = -956574406;break;default:long fmbrpomk = 603466880;break;}
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