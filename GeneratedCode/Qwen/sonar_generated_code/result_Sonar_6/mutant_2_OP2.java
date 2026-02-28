import java.util.concurrent.Executors;

class VirtualThreadBugDemo {

    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        t.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setPriority(1); // Mutant: Duplicate of the setPriority call
        t.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(false); // Mutant: Duplicate of the setDaemon(false) call
        t.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(true); // Mutant: Duplicate of the setDaemon(true) call
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        var threadGroupCopy = t.getThreadGroup(); // Mutant: Duplicate of the getThreadGroup call with a unique variable name
        System.out.println("Thread Group: " + threadGroup);
        System.out.println("Thread Group Copy: " + threadGroupCopy); // Mutant: Print statement for the duplicated getThreadGroup call
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}