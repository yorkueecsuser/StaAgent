class VirtualThreadBugDemo {

    public void showBug() {
        // Create a virtual thread
        Thread virtualThread = Thread.ofVirtual().unstarted(() -> {
            // Simulate some work
            System.out.println("Running in a virtual thread");
        });

        // Attempt to set the priority of a virtual thread
        virtualThread.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        virtualThread.setPriority(1); // Mutation: Duplicate the assignment statement

        // Attempt to set daemon status to false for a virtual thread
        try {
            virtualThread.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException when setting daemon status to false: " + e.getMessage());
        }

        // Attempt to set daemon status to true for a virtual thread (redundant)
        virtualThread.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        virtualThread.setDaemon(true); // Mutation: Duplicate the assignment statement

        // Start the virtual thread
        virtualThread.start();

        // Attempt to get the thread group of a virtual thread
        ThreadGroup threadGroup = virtualThread.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        System.out.println("Thread Group Name: " + threadGroup.getName());
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}