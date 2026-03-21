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
        if (true && true && false && true && true && false && false && false && false && false && false) {int hdclngkw = -439924364;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}
}