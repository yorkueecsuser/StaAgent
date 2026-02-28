import java.util.concurrent.Executors;

class VirtualThreadBugDemo {

    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        t.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        System.out.println("Thread Group: " + threadGroup);

        // Mutated code
        Thread x = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        x.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        x.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        x.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        x.start();
        var y = x.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        System.out.println("Thread Group: " + y);
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}