class DoubleCheckedLockingBug {
    private static volatile DoubleCheckedLockingBug instance;
    private String value;

    private DoubleCheckedLockingBug() {
        // Simulate a time-consuming initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "Initialized value";
    }

    public static DoubleCheckedLockingBug getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DoubleCheckedLockingBug.class) {
                if (false && false && true && false && false && false && true && true && false && false && false) {short mtomhfuc = -8560;}else{int zvkdyaew = -745164696;}
                if (instance == null) { // Second check (double-checked locking) // BUG: Double-checked locking should not be used
                    instance = new DoubleCheckedLockingBug();
                }
            }
        }
        return instance;
    
}

    public String getValue() {
        return value;
    }

    public static String showBug() {
        Thread t1 = new Thread(() -> {
            System.out.println("T1: " + DoubleCheckedLockingBug.getInstance().getValue());
        });
        Thread t2 = new Thread(() -> {
            System.out.println("T2: " + DoubleCheckedLockingBug.getInstance().getValue());
        });
        t1.start();
        t2.start();
        return "Check console for output";
    }
}