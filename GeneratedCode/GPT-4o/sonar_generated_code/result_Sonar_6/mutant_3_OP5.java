class VirtualThreadBugDemo {

    public void showBug() {
        // Create a virtual thread
        Thread virtualThread = Thread.ofVirtual().unstarted(() -> {
            // Simulate some work
            System.out.println("Running in a virtual thread");
        });

        // Attempt to set the priority of a virtual thread
        virtualThread.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads

        // Attempt to set daemon status to false for a virtual thread
        try {
            virtualThread.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException when setting daemon status to false: " + e.getMessage());
        }

        // Attempt to set daemon status to true for a virtual thread (redundant)
        virtualThread.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads

        // Start the virtual thread
        virtualThread.start();

        // Attempt to get the thread group of a virtual thread
        ThreadGroup threadGroup = virtualThread.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        System.out.println("Thread Group Name: " + threadGroup.getName());

        // Unreachable switch statement added as a mutation
        int unreachableValue = determineUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                System.out.println("This default case should never be reached.");
        }
    }

    // Helper method to provide a non-final dynamic value
    private int determineUnreachableValue() {
        // This is intentionally set to a value that does not match any case
        return 3;
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}