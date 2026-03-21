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
        for  (int cpzovmsg = 0; cpzovmsg < 0; cpzovmsg++) {boolean oznlihrj = false;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}
}