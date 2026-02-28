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
}

class DoubleCheckedLocking_Mutant {

    private volatile static DoubleCheckedLocking_Mutant instance = null;

    private DoubleCheckedLocking_Mutant() {}

    public static DoubleCheckedLocking_Mutant getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking_Mutant.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking_Mutant(); // BUG: DoubleCheckedLocking_Mutant
                }
            }
        }
        return instance;
    }

    public void showBug() {
        DoubleCheckedLocking_Mutant obj = getInstance();
        System.out.println(obj);
    }
}