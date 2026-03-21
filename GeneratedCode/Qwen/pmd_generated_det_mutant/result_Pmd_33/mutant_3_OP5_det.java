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
        int xmejcdop = 0;switch  (xmejcdop) {case 1:short cqlluink = 6698;break;default:byte dlpndrbd = -12;break;}
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    
}

    public void doSomethingElse() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void showBug() {
        // Demonstrating the bug by calling System.gc()
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public void showBug1() {
        // Demonstrating the bug by calling Runtime.getRuntime().gc()
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
    }

    public static void main(String[] args) {
        GCCall gcCall = new GCCall();
        gcCall.doSomething();
        gcCall.explicitGCcall();
        gcCall.doSomethingElse();
        gcCall.showBug();
        gcCall.showBug1();
    }
}