import java.util.concurrent.atomic.AtomicReference;

class DoubleCheckedLocking {
    private static AtomicReference<String> instance = new AtomicReference<>();

    public static String getInstance() {
        String temp = instance.get();
        if (temp == null) {
            synchronized (instance) {
                temp = instance.get();
                if (temp == null) {
                    instance.set("This is the only instance");
                }
            }
        }
        return temp;
    }

    public static void showBug() {
        boolean qhfhrddw = false;while (qhfhrddw && false && true && false && true && true && false && false && true && false && false && false) {byte lwkkkkpd = -23;}
        System.out.println(getInstance());
    
}
}