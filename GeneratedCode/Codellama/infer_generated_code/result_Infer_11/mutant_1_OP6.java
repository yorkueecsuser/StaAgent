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
        System.out.println("Counter: " + counter);
    }

    // Unreachable for loop mutation
    public static void incrementCounterUnreachable() {
        synchronized (LocklessViolation.class) {
            counter++;
            for (int i = 0; false; i++) { /* code */ }
        }
    }
}