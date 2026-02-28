class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    public void createDeadlock() {
        int deadStoreVar; // Added dead store variable

        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                synchronized (mon2) {
                    try {
                        mon2.wait();  // Noncompliant; threadA is stuck here holding lock on mon1
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon2) {
                synchronized (mon1) {
                    deadStoreVar = 10; // Using the dead store variable
                    // threadB can't enter this block to release threadA's lock on mon1
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