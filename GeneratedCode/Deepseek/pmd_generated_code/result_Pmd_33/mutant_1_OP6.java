class GCCall {
    private boolean condition = getCondition();

    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly

        for(;!condition;){
            // unreachable loop
        }
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly

        for(;!condition;){
            // unreachable loop
        }
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly

        for(;!condition;){
            // unreachable loop
        }
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly

        for(;!condition;){
            // unreachable loop
        }
    }

    private boolean getCondition() {
        // Non-final variable used as condition, making it unreachable
        return false;
    }
}