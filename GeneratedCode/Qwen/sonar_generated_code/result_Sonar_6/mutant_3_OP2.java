import java.util.concurrent.Executors;

class VirtualThreadBugDemo {

    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        t.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setPriority(1); // DUPLICATION: Duplicate of the previous setPriority call
        t.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(false); // DUPLICATION: Duplicate of the previous setDaemon call
        t.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(true); // DUPLICATION: Duplicate of the previous setDaemon call
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        var threadGroupCopy = t.getThreadGroup(); // DUPLICATION: Duplicate of the previous getThreadGroup call
        System.out.println("Thread Group: " + threadGroup);
        System.out.println("Thread Group Copy: " + threadGroupCopy); // Output for the duplicated getThreadGroup call
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}