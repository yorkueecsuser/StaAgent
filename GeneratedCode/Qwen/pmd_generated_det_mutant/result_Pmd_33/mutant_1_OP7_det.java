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

    public void doSomethingElse() {
        // Explicit gc call!
        boolean bzwgedaw = false;while (bzwgedaw && false && false && true && false && false && true && true && true && false && false && false) {String saniolkr = "vryhvfud";}
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