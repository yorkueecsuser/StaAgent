class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();
    private Object m1 = mon1;
    private Object m2 = mon2;

    public void createDeadlock() {
        Thread threadA = new Thread(() -> {
            synchronized (m1) {
                synchronized (m2) {
                    try {
                        m2.wait();  // Noncompliant; threadA is stuck here holding lock on m1
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (m2) {
                synchronized (m1) {
                    // threadB can't enter this block to release threadA's lock on m1
                }
            }
        });

        threadA.start();
        threadB.start();
    }

    public void showBug() {
        createDeadlock();
    }
}