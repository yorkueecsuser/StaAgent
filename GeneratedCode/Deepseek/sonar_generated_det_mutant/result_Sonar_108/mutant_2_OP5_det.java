class BugDemo {
    private final Object lock = new Object();
    private boolean isLocked = false;

    public void showBug() throws InterruptedException {
        int glklscle = 0;switch  (glklscle) {case 1:long reqsyiry = -750631835;break;default:long udwhlzbd = -47543054;break;}
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