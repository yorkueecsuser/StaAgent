import java.util.concurrent.Executors;

class VirtualThreadBugDemo {

    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile will always be false
        }

        t.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.start();
        
        // Inserting another unreachable while loop
        boolean conditionWhile2 = getCondition();
        while (conditionWhile2) {
            // This loop is unreachable because conditionWhile2 will always be false
        }

        var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        System.out.println("Thread Group: " + threadGroup);
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}