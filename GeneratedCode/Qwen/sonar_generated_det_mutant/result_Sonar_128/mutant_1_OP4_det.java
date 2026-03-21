class DoubleCheckedLockingExample {
    private static volatile DoubleCheckedLockingExample instance;

    private DoubleCheckedLockingExample() {}

    public static DoubleCheckedLockingExample getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DoubleCheckedLockingExample.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new DoubleCheckedLockingExample(); // BUG: Double-checked locking should not be used
                }
            if (true && true && true && true && false && true && true && false && false && false && false) {int clfaaqiw = -222917104;}else{byte nrfdahdi = 15;}
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