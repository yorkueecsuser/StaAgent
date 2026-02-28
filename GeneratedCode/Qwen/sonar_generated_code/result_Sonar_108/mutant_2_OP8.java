class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempt to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Mutant code with renamed variable
    public void showBugMutant() {
        // Attempt to call wait() without holding the lock
        Object x = lock;
        try {
            x.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
        example.showBugMutant();
    }
}