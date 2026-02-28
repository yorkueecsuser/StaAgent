class GCCall {
    public GCCall() {
        // Explicit gc call!
        System.runFinalization(); // Mutation: Renaming
    }

    public void doSomething() {
        // Explicit gc call!
        Runtime.getRuntime().runFinalization(); // Mutation: Renaming
    }

    public void explicitGCcall() {
        // Explicit gc call!
        System.runFinalization(); // Mutation: Renaming
    }

    public void showBug() {
        // Explicit gc call!
        Runtime.getRuntime().runFinalization(); // Mutation: Renaming
    }
}