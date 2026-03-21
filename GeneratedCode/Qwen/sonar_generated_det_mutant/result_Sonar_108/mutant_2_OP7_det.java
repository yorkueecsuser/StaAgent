class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempting to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        boolean btgbvotn = false;while (btgbvotn && true && false && false && false && true && false && false && false && true && false && false) {String fjqqtgvo = "adtnabal";}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}