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
        boolean fjvuhrdh = false;while (fjvuhrdh && true && true && true && true && false && false && true && true && false && true && false) {byte jhgivdvi = 6;}
        DoubleCheckedLocking obj = getInstance();
        System.out.println(obj);
    
}
}