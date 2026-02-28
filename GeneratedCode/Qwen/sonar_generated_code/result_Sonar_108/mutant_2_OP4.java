class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempt to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code

            // Inserting unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This is reachable code.");
            } else {
                System.out.println("This is unreachable code.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return true; // This method always returns true, making the else branch unreachable
    }

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}