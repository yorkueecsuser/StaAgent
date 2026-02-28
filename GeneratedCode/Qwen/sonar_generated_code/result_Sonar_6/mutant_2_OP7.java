import java.util.concurrent.Executors;

class VirtualThreadBugDemo {

    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });

        // Introduced an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This is an unreachable loop");
        }

        t.setPriority(1); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads

        // Introduced another unreachable while loop
        boolean anotherConditionWhile = getAnotherCondition();
        while (anotherConditionWhile) {
            // This loop is unreachable because getAnotherCondition() returns false
            System.out.println("This is another unreachable loop");
        }

        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        System.out.println("Thread Group: " + threadGroup);
    }

    private boolean getCondition() {
        return false;
    }

    private boolean getAnotherCondition() {
        return false;
    }

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}