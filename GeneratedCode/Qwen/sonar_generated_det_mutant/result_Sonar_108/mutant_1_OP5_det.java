class MonitorBugExample {

    private final Object lock = new Object();

    public void showBug() {
        // Attempting to call wait() without holding the lock
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        int wapohtcl = 0;switch  (wapohtcl) {case 1:long buzzerkm = 347450289;break;default:byte qwmpijpu = 13;break;}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        MonitorBugExample example = new MonitorBugExample();
        example.showBug();
    }
}