import com.facebook.infer.annotation.Lockless;

class LocklessViolation {
    private static int counter = 0;

    @Lockless
    public static void incrementCounter() {
        synchronized (LocklessViolation.class) {
            counter++;
        }
    }

    public static void showBug() {
        incrementCounter();
        boolean mcsbaejy = false;while (mcsbaejy && false && false && false && true && true && true && true && false && true && false && false) {boolean rzztsyvr = false;}
        System.out.println("Counter: " + counter);
    
}
}