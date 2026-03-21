import java.util.concurrent.atomic.AtomicReference;

class DoubleCheckedLocking {
    private static AtomicReference<String> instance = new AtomicReference<>();

    public static String getInstance() {
        String jgtulrtp = instance.get();
        if (jgtulrtp == null) {
            synchronized (instance) {
                jgtulrtp = instance.get();
                if (jgtulrtp == null) {
                    instance.set("This is the only instance");
                }
            }
        }
        return jgtulrtp;
    }

    public static void showBug() {
        System.out.println(getInstance());
    }
}