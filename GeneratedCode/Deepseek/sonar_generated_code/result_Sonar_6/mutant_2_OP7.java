import java.lang.Thread;

class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        t.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads

        // Unreachable While loop mutation applied
        while (getCondition()) {
            // Empty block of code
        }
    }

    // Non-final static boolean variable added for non-compile-time constants
    private static boolean condition = true;

    // Method to get the condition variable
    public static boolean getCondition() {
        return condition;
    }
}