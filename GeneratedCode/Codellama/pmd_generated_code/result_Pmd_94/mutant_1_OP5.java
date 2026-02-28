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

    public void unreachableSwitch() {
        int value = getValue();
        switch (value) {
            case 0:
                // code to be executed when value is 0
                break;
            case 1:
                // code to be executed when value is 1
                break;
            default:
                // code to be executed when value is neither 0 nor 1
                break;
        }
    }
}