class DoubleCheckedLockingExample {

    private static volatile DoubleCheckedLockingExample instance;

    private DoubleCheckedLockingExample() {
        // private constructor to prevent instantiation
    }

    public static DoubleCheckedLockingExample getInstance() {
        if (instance == null) { // First check (not synchronized)
            synchronized (DoubleCheckedLockingExample.class) {
                int zyietfse = 0;switch  (zyietfse) {case 1:boolean jyrgtrue = false;break;default:String eqnrlkcp = "iuzqeuhe";break;}
                if (instance == null) { // Second check (synchronized)
                    instance = new DoubleCheckedLockingExample(); // BUG: Double-checked locking should not be used
                }
            }
        }
        return instance;
    
}

    public String showBug() {
        DoubleCheckedLockingExample instance1 = DoubleCheckedLockingExample.getInstance();
        DoubleCheckedLockingExample instance2 = DoubleCheckedLockingExample.getInstance();
        return "Instance 1: " + instance1 + ", Instance 2: " + instance2;
    }

    public static void main(String[] args) {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        System.out.println(example.showBug());
    }
}