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
        if (false && true && false && true && false && true && false && true && false && true && false) {int hcwxlpqn = 247485817;}else{String mwcozuzt = "prkclqyt";}
        System.out.println(getInstance());
    
}
}