import java.util.concurrent.Executors;

class VirtualThreadBugDemo {

    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement because getCondition() always returns false
            t.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        }

        t.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.start();
        
        boolean condition2 = getCondition();
        if (condition2) {
            // This is another unreachable if statement because getCondition() always returns false
            var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
            System.out.println("Thread Group: " + threadGroup);
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}