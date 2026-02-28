class DoubleCheckedLockingBug {
    private static volatile DoubleCheckedLockingBug instance;
    private String message;

    private DoubleCheckedLockingBug() {
        // Simulating some initialization time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        message = "Initialized";
    }

    public static DoubleCheckedLockingBug getInstance() {
        if (instance == null) { // First check (lazy initialization)
            synchronized (DoubleCheckedLockingBug.class) {
                if (instance == null) { // Second check (double-checked locking) // BUG: Double-checked locking should not be used
                    instance = new DoubleCheckedLockingBug();
                }
            }
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public static void showBug() {
        Thread thread1 = new Thread(() -> {
            DoubleCheckedLockingBug obj1 = DoubleCheckedLockingBug.getInstance();
            System.out.println(obj1.getMessage());
        });

        Thread thread2 = new Thread(() -> {
            DoubleCheckedLockingBug obj2 = DoubleCheckedLockingBug.getInstance();
            System.out.println(obj2.getMessage());
        });

        thread1.start();
        thread2.start();
    }
}