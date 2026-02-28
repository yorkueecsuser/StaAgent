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
                        mon2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (getFalseCondition()) {
                        // This block will never be executed
                        System.out.println("Unreachable code in threadA");
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon2) {
                synchronized (mon1) {
                    if (getFalseCondition()) {
                        // This block will never be executed
                        System.out.println("Unreachable code in threadB");
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