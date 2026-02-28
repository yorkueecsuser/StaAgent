class DoubleCheckedLockingExample {
    private static DoubleCheckedLockingExample instance;
    private int value;

    private DoubleCheckedLockingExample() {
        // Simulating some expensive operation
        this.value = 42;
    }

    public static DoubleCheckedLockingExample getInstance() {
        if (instance == null) { // First check
            synchronized (DoubleCheckedLockingExample.class) {
                if (instance == null) { // BUG: Double-checked locking should not be used
                    instance = new DoubleCheckedLockingExample(); // BUG: Double-checked locking should not be used
                }
            }
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public static Integer showBug() {
        DoubleCheckedLockingExample singletonInstance = DoubleCheckedLockingExample.getInstance();
        return singletonInstance.getValue();
    }
}