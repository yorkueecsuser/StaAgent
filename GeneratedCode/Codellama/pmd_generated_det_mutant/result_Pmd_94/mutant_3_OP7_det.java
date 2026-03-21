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
        boolean uahzlhhb = false;while (uahzlhhb && false && false && true && true && false && false && true && true && true && true && false) {byte sbbcsdqm = 55;}
        DoubleCheckedLocking obj = getInstance();
        System.out.println(obj);
    
}
}