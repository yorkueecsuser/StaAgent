class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempt to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}