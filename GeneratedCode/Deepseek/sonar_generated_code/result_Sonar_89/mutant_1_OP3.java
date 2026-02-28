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
            if(false) {
                System.out.println("Unreachable statement");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }
}