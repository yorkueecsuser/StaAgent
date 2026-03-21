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
        int agaucvew = 0;switch  (agaucvew) {case 1:boolean icvfeyxf = false;break;default:float bofqwrvg = -833395106;break;}
        System.out.println(getInstance());
    
}
}