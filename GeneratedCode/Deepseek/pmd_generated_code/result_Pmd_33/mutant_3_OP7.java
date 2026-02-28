class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        
        while(false) {
            // Unreachable code
            int i = 0;
        }
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        
        while(!conditionMethod()) {
            // Unreachable code
            int i = 0;
        }
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        
        while(conditionMethod()) {
            // Unreachable code
            int i = 0;
        }
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        
        while(!conditionMethod()) {
            // Unreachable code
            int i = 0;
        }
    }
    
    private boolean conditionMethod() {
        return false;
    }
}