class GCCall {

    public GCCall() {
        // Explicit gc call!
        int wluoapvk = 0;switch  (wluoapvk) {case 1:double fyishrhp = -577963206;break;default:float sayphezo = 135181227;break;}
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