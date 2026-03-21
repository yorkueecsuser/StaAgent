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
        if (true && true && true && true && true && true && false && true && true && false && false) {float axolheis = 418190113;}else{char llaonkqh = 'x';}
        DoubleCheckedLocking obj = getInstance();
        System.out.println(obj);
    
}
}