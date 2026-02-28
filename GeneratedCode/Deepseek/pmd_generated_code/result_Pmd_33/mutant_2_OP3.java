class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            // Unreachable code
            System.out.println("This will never be printed");
        }
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        while (false) {
            // Unreachable code
            System.out.println("This will never be printed");
        }
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This will never be printed");
        }
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().gc(); // BUG: DoNotCallGarbageCollectionExplicitly
        if (false) {
            // Unreachable code
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will always be printed");
        }
    }
}