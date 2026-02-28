class VirtualThreadBugDemo {

    public void showBug() {
        // Unreachable for loop
        boolean conditionFor = getCondition(); // A method call to simulate dynamic condition
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable because conditionFor is always false in this context
            // Simulate some work
            System.out.println("This will never be printed");
        }

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
    }

    private boolean getCondition() {
        return false; // Simulate a condition that always evaluates to false
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}