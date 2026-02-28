class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempt to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Introduced unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This is also never reachable due to the condition");
                break;
        }
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}