class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    public void createDeadlock() {
        // Unreachable switch statement
        boolean isSwitchReachable = getCondition();
        if (isSwitchReachable) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("This line will never execute");
                    break;
            }
        }

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
                    // threadB can't enter this block to release threadA's lock on mon1
                }
            }
        });

        threadA.start();
        threadB.start();
    }

    private boolean getCondition() {
        return false;  // This condition will always return false, making the switch statement unreachable
    }

    private int getValue() {
        return 0;  // This value will never match the case, making the switch statement unreachable
    }

    public void showBug() {
        createDeadlock();
    }
}