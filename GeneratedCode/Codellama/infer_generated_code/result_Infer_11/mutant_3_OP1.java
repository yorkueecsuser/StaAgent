import com.facebook.infer.annotation.Lockless;

class LocklessViolation {
    private static int counter = 0;
    private static int randomValue = 0; // Dead store

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
}