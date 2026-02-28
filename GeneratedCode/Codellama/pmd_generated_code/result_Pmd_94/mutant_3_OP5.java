import java.util.concurrent.atomic.AtomicReference;

class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    public void showBug() {
        DoubleCheckedLocking obj = getInstance();
        System.out.println(obj);
    }

    // Unreachable switch statement mutant
    public void showBugMutant() {
        DoubleCheckedLocking obj = getInstanceMutant();
        System.out.println(obj);
    }

    private static DoubleCheckedLocking getInstanceMutant() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    private int getValueMutant() {
        return 0;
    }

    public void switchMutant() {
        int value = getValueMutant();
        switch (value) {
            case 1:
                // code here
                break;
            case 2:
                // code here
                break;
            default:
                // code here
                break;
        }
    }
}