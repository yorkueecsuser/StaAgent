class DeadlockDemo {
    private Object mon1 = new Object();
    private Object o = new Object();  // Renamed variable

    public void createDeadlock() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                synchronized (o) {  // Renamed variable used here
                    try {
                        o.wait();  // Renamed variable used here
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (o) {  // Renamed variable used here
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