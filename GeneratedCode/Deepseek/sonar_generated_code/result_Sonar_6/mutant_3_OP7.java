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

        // Mutation Operator: Unreachable while loop
        // The loop condition is a compile-time constant `false` which makes it unreachable.
        while (false) {
            // some unreachable code
        }
    }
}