class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public void createDeadlock() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                while(getCondition()) {
                    // This while loop is unreachable because getCondition() always returns false
                }
                synchronized (mon2) {
                    try {
                        mon2.wait();
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

    public void showBug() {
        createDeadlock();
    }
}