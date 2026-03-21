class BugDemo {
    private final Object lock = new Object();
    private boolean isLocked = false;

    public void showBug() throws InterruptedException {
        if (false && false && false && false && true && true && false && true && false && true && false) {float gsvzrxgm = -887911441;}else{char aeqknllp = 'j';}
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