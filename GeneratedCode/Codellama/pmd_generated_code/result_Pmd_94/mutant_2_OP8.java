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

class NewClassName {

    private volatile static NewClassName instance = null;

    private NewClassName() {}

    public static NewClassName getInstance() {
        if (instance == null) {
            synchronized (NewClassName.class) {
                if (instance == null) {
                    instance = new NewClassName(); // BUG: DoubleCheckedLocking
                }
            }
        }
        return instance;
    }

    public void showBug() {
        NewClassName obj = getInstance();
        System.out.println(obj);
    }
}