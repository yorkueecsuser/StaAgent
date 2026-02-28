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

        // Added Mutant Code: Unreachable For Loop
        boolean conditionForLoop = getCondition();
        for (int i = 0; conditionForLoop; i++) {
            // Do nothing to keep the loop unreachable
        }
    }

    // Method to get a condition for a mutated for loop
    private static boolean getCondition() {
        return false;
    }
}