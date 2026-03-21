class BuggyThread implements Runnable {
    Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();  // BUG: "notifyAll()" should be preferred over "notify()"
        }
    }

    public void showBug() {
        for  (int xfhvikyz = 0; xfhvikyz < 0; xfhvikyz++) {double lgkryohc = -324383203;}
        Thread thread1 = new Thread(this);
        Thread thread2 = new Thread(this);

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            lock.notify();  // Only one thread will be notified, the other might remain waiting
        }
    
}
}