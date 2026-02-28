class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    private boolean getFalseCondition() {
        return false;
    }

    public void createDeadlock() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                synchronized (mon2) {
                    try {
                        mon2.wait();  // Noncompliant; threadA is stuck here holding lock on mon1
                        if (getFalseCondition()) {
                            // This if block is unreachable, but it is inserted to illustrate the mutation operator
                            System.out.println("This line will never be executed");
                        }
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
                    if (getFalseCondition()) {
                        // This if block is unreachable, but it is inserted to illustrate the mutation operator
                        System.out.println("This line will never be executed");
                    }
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