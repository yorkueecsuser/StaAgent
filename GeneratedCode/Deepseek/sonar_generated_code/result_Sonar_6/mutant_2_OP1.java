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
        String deadStore1 = "dummyStr"; // Mutation: Dead Store added here
        var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        String deadStore2 = "dummyStr"; // Mutation: Dead Store added here
    }
}