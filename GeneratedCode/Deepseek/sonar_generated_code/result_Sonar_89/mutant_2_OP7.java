class BugExample {
    private int value;

    synchronized void setValue(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }

    public int showBug() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                setValue(i);
                System.out.println("Thread 1 set value to " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 read value as " + getValue());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        // Unreachable while loop mutation
        boolean unreachable = getUnreachableCondition(); // getUnreachableCondition() is a method that always returns false
        while (unreachable) {
            System.out.println("This is an unreachable statement");
        }
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    // This method always returns false and is used to insert an unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }
}