import java.lang.Thread;

class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        boolean virtualThread =!t.isVirtual(); // Unreachable switch statement mutation operator
        switch (virtualThread) {
            case true:
                t.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
                t.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
                t.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
                t.start();
                var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
                break;
            case false:
                // Unreachable block
                break;
        }
    }
}