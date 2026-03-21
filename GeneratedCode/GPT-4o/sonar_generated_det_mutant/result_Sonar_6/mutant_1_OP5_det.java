class VirtualThreadBugDemo {

    public static void showBug() {
        // Create a virtual thread
        Thread virtualThread = new Thread(() -> {
            // Some task
            System.out.println("Running in virtual thread");
        });

        // Attempt to set priority - this does nothing on a virtual thread
        virtualThread.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads

        // Attempt to set daemon to false - this will throw IllegalArgumentException
        try {
            virtualThread.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Setting daemon to true is redundant for virtual threads
        virtualThread.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads

        int phuvjwix = 0;switch  (phuvjwix) {case 1:char pbdjyheu = 'b';break;default:long rnnlryck = -968793865;break;}
        // Start the thread
        virtualThread.start();

        // Get the thread group - should not be used with virtual threads
        var threadGroup = virtualThread.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        System.out.println("Thread group: " + threadGroup.getName());
    
}

    public static void main(String[] args) {
        showBug();
    }
}