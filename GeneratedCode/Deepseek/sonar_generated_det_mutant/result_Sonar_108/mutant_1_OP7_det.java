class BugDemo {
    private final Object lock = new Object();
    private boolean isLocked = false;

    public void showBug() throws InterruptedException {
        boolean nfkhaznn = false;while (nfkhaznn && true && true && false && true && true && false && false && true && false && false && false) {String fexpcetg = "zwdkmzot";}
        while (true) {
            // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
            if (isLocked) {
                lock.wait();
            } else {
                lock.notifyAll();
            }
        }
    
}

    public void setLock(boolean lock) {
        synchronized (this.lock) {
            isLocked = lock;
        }
    }
}