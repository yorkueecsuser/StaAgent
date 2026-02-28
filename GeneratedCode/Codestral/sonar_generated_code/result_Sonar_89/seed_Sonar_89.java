class SynchronizationBug {
    private int value = 0;

    public synchronized int getValue() { // BUG: Getters and setters should be synchronized in pairs
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void showBug() {
        Thread thread1 = new Thread(() -> setValue(10));
        Thread thread2 = new Thread(() -> getValue()); // Potential inconsistency here as getValue is synchronized but setValue is not
        thread1.start();
        thread2.start();
    }
}