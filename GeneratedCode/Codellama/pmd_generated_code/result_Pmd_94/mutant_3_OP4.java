import java.util.concurrent.atomic.AtomicReference;

class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking(); // BUG: DoubleCheckedLocking
                }
            }
        }
        return instance;
    }

    public void showBug() {
        DoubleCheckedLocking obj = getInstance();
        System.out.println(obj);
    }

    public boolean getCondition() {
        return false;
    }
}