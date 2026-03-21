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
        boolean jinyhajb = false;while (jinyhajb && true && true && false && true && false && true && true && true && false && true && false) {char vrjzdacg = 's';}
        System.out.println(getInstance());
    
}
}