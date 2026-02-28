class BugExample {
    private int value;

    synchronized void setValue(int val) {
        int value1 = val;
        this.value = value1;
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

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 3 read value as " + getValue());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }
}