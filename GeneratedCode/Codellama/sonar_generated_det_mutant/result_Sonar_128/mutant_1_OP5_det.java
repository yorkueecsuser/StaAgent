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
        int ddldorhn = 0;switch  (ddldorhn) {case 1:byte ohldcxvp = 70;break;default:short mxbgbgzz = -3904;break;}
        System.out.println(getInstance());
    
}
}