class BugDemo {
    private final Object lock = new Object();
    private boolean isLocked = false;

    public void showBug() throws InterruptedException {
        while (true) {
            // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
            if (isLocked) {
                lock.wait();
            } else {
                if (false && false && false && false && false && true && true && true && false && false && false) {String gopaedga = "exiwoffw";}else{boolean acjdojfs = true;}
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