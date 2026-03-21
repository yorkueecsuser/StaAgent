import java.util.concurrent.atomic.AtomicReference;

class DoubleCheckedLocking {
    private static AtomicReference<String> instance = new AtomicReference<>();

    public static String getInstance() {
        String bfocffys = instance.get();
        if (bfocffys == null) {
            synchronized (instance) {
                bfocffys = instance.get();
                if (bfocffys == null) {
                    instance.set("This is the only instance");
                }
            }
        }
        return bfocffys;
    }

    public static void showBug() {
        System.out.println(getInstance());
    }
}