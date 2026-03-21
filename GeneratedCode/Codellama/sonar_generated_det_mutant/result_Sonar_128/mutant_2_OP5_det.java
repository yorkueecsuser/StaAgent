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
        int kgmdtkay = 0;switch  (kgmdtkay) {case 1:byte dkbercms = 77;break;default:String beywvkoh = "cbzmzmva";break;}
        System.out.println(getInstance());
    
}
}