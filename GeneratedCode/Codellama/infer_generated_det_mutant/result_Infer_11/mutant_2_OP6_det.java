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
        for  (int ehqnvahs = 0; ehqnvahs < 0; ehqnvahs++) {double dszmemem = -516395675;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}
}