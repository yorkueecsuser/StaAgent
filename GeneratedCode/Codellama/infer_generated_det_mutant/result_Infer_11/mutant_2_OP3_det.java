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
        if (false && false && false && true && true && false && true && true && false && true && false) {float aqurnkhr = -346452791;}
        System.out.println("Counter: " + counter);
    
}
}