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

        // Added mutants
        boolean condition1 = false;
        if (condition1) {
            t.setPriority(1);
        }

        condition1 = false;
        if (condition1) {
            t.setDaemon(false);
        }

        condition1 = false;
        if (condition1) {
            t.setDaemon(true);
        }

        condition1 = false;
        if (condition1) {
            var threadGroupMutant = t.getThreadGroup();
        }
    }
}