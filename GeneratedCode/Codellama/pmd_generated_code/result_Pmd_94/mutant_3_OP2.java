import java.util.concurrent.atomic.AtomicReference;

class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking(); // BUG: DoubleCheckedLocking
                    instance = new DoubleCheckedLocking(); // Mutant 1: Duplication
                }
            }
        }
        return instance;
    }

    public void showBug() {
        DoubleCheckedLocking obj = getInstance();
        System.out.println(obj);
    }
}