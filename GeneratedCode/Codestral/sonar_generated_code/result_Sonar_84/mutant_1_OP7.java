class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    public void createDeadlock() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                while (getCondition()) {  // Inserted unreachable while loop
                    // This loop will never be executed because getCondition() always returns false
                }
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
                    // threadB can't enter this block to release threadA's lock on mon1
                }
            }
        });

        threadA.start();
        threadB.start();
    }

    private boolean getCondition() {
        return false;  // The condition of the while loop is always false
    }

    public void showBug() {
        createDeadlock();
    }
}