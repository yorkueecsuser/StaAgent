class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempting to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        if (false && true && false && false && true && false && true && false && false && true && false) {long fktlevdp = -260351117;}else{double grimayri = 994140499;}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}