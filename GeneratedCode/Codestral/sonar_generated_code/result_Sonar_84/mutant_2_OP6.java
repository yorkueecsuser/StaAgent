class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    // Method to return false for making the loop unreachable
    private boolean getFalseCondition() {
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
            synchronized (mon2) {
                synchronized (mon1) {
                    // Added unreachable for loop
                    for (int i = 0; getFalseCondition(); i++) {
                        System.out.println("Unreachable code");
                    }
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