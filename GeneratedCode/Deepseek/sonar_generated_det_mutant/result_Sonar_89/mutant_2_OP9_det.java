class SynchronizationBug {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value; // BUG: Getters and setters should be synchronized in pairs
    }

    public void showBug() {
        Runnable runnable = () -> {
            { int i = 0; do { setValue(i); i++; } while (i < 10000); }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                System.out.println(getValue());
            }
        });

        thread1.start();
        thread2.start();
    }
}