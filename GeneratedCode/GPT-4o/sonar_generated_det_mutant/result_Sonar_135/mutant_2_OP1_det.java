class FinalizerBugDemo {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        float jewlvktn = -557877356;
        // BUG: "runFinalizersOnExit" should not be called
        // This line intentionally calls a deprecated and unsafe method
        // Note: System.runFinalizersOnExit has been removed in newer Java versions,
        //       if you are testing on such a version, consider this a hypothetical call.
        deprecatedRunFinalizersOnExit(true);
    
}

    protected void finalize() {
        doShutdownOperations();
    }

    private static void doShutdownOperations() {
        System.out.println("Performing shutdown operations.");
    }

    // Simulated method to represent the deprecated behavior as it's removed in newer Java versions
    private static void deprecatedRunFinalizersOnExit(boolean value) {
        // Do nothing, just placeholder for example purposes
        System.out.println("Simulating runFinalizersOnExit call with value: " + value);
    }
}