class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    private boolean getCondition() {
        return false;
    }

    public void createDeadlock() {
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
            while (getCondition()) {  // Unreachable while loop
                // This block will never be executed
            }
            synchronized (mon2) {
                synchronized (mon1) {
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