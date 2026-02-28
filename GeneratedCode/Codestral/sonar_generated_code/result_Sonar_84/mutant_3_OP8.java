class DeadlockDemo {
    private Object mon1 = new Object();
    private Object obj2 = new Object();  // Renamed variable'mon2' to 'obj2'

    public void createDeadlock() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                synchronized (obj2) {  // Used the renamed variable 'obj2' here
                    try {
                        obj2.wait();  // Noncompliant; threadA is stuck here holding lock on mon1
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (obj2) {  // Used the renamed variable 'obj2' here
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