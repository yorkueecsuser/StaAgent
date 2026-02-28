import com.facebook.infer.annotation.Lockless;

class LocklessViolation {
    private static int counter = 0;

    @Lockless
    public static void incrementCounter() {
        do {
            synchronized (LocklessViolation.class) {
                counter++;
            }
        } while (true);
    }

    public static void showBug() {
        incrementCounter();
        System.out.println("Counter: " + counter);
    }
}