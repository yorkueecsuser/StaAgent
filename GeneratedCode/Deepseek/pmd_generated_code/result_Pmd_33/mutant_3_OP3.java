class GCCall {
    private boolean condition;

    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            // Unreachable code 
            System.out.println("This code is unreachable due to the false condition");
        }
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            // Unreachable code 
            System.out.println("This code is unreachable due to the false condition");
        }
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            // Unreachable code 
            System.out.println("This code is unreachable due to the false condition");
        }
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            // Unreachable code 
            System.out.println("This code is unreachable due to the false condition");
        }
    }
}