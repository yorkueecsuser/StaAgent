class DoubleCheckedLockingBug {

    private static volatile DoubleCheckedLockingBug instance = null;

    private DoubleCheckedLockingBug() {}

    public static DoubleCheckedLockingBug getInstance() {
        if (instance == null) { // BUG: Double-checked locking should not be used
            synchronized (DoubleCheckedLockingBug.class) {
                if (instance == null) { // BUG: Double-checked locking should not be used
                    instance = new DoubleCheckedLockingBug(); // BUG: Double-checked locking should not be used
                }
            }
        }
        return instance;
    }

    public DoubleCheckedLockingBug showBug() {
        return getInstance();
    }
}