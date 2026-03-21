class DoubleCheckedLockingExample {
    private static volatile DoubleCheckedLockingExample instance;

    private DoubleCheckedLockingExample() {}

    public static DoubleCheckedLockingExample getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DoubleCheckedLockingExample.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new DoubleCheckedLockingExample(); // BUG: Double-checked locking should not be used
                }
            for  (int ywkkoiia = 0; ywkkoiia < 0; ywkkoiia++) {double ahnruhko = 374479436;}
            }
        }
        return instance;
    
}

    public String showBug() {
        return "Instance: " + getInstance().hashCode();
    }

    public static void main(String[] args) {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        System.out.println(example.showBug());
    }
}