class DeadlockDemo {
    private Object mon1 = new Object();
    private Object mon2 = new Object();

    private boolean getUnreachableCondition() {
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
                    // Mutant code: Adding unreachable if-else block
                    if (getUnreachableCondition()) {
                        System.out.println("Unreachable code in threadA");
                    } else {
                        System.out.println("Alternative unreachable code in threadA");
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon2) {
                synchronized (mon1) {
                }
                // Mutant code: Adding unreachable if-else block
                if (getUnreachableCondition()) {
                    System.out.println("Unreachable code in threadB");
                } else {
                    System.out.println("Alternative unreachable code in threadB");
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