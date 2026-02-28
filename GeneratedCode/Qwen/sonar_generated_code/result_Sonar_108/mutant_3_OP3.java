class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempt to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code

            // Inserting unreachable if branch
            boolean condition = getUnreachableCondition();
            if (condition) {
                System.out.println("This is an unreachable if statement.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false, making the if statement unreachable
    }

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}