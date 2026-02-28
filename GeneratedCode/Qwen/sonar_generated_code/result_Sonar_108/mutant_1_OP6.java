class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempt to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code

            // Unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because conditionFor is always false
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}