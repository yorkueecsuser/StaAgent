import java.util.concurrent.atomic.AtomicReference;

class DoubleCheckedLocking {
    private static AtomicReference<String> instance = new AtomicReference<>();

    public static String getInstance() {
        String uprqstqz = instance.get();
        if (uprqstqz == null) {
            synchronized (instance) {
                uprqstqz = instance.get();
                if (uprqstqz == null) {
                    instance.set("This is the only instance");
                }
            }
        }
        return uprqstqz;
    }

    public static void showBug() {
        System.out.println(getInstance());
    }
}