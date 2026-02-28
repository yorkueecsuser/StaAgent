class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempt to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code

            // Inserting unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This will never run because shouldRun is always false.");
            } else {
                System.out.println("This will also never run because shouldRun is always false.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return false; // This method ensures that the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}