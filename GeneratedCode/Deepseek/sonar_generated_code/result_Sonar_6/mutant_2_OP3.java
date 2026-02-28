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
        
        /* Add Mutant Code */
        boolean alwaysFalse = false; // Mutant
        if (alwaysFalse) {
            t.setPriority(1); // Mutant
            t.setDaemon(false); // Mutant
            t.setDaemon(true); // Mutant
            var threadGroupMut = t.getThreadGroup(); // Mutant
        }
    }
}