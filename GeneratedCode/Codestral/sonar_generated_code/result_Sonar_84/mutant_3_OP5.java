class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    public void createDeadlock() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                int value = getFalseValue(); // Method call to ensure runtime evaluation
                switch (value) {
                    case 1:
                        // This code is unreachable
                        break;
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

    private int getFalseValue() {
        // This method always returns 0, ensuring the switch statement is unreachable
        return 0;
    }
}