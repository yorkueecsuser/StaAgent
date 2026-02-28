class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    public void createDeadlock() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                synchronized (mon2) {
                    try {
                        mon2.wait();
                        int unreachableValue = getUnreachableValue();
                        switch (unreachableValue) {
                            case 1:
                                // Unreachable code
                                break;
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
                    int unreachableValue = getUnreachableValue();
                    switch (unreachableValue) {
                        case 1:
                            // Unreachable code
                            break;
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

    private int getUnreachableValue() {
        return -1; // Always returns a value that's not 1 to make the switch unreachable
    }
}