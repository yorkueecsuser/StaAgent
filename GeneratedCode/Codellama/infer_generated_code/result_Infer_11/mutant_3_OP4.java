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

    public static void main(String[] args) {
        // Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            // This branch is always false and will never be executed
            counter++;
        } else {
            // The else branch is always executed
            counter--;
        }
        System.out.println("Counter: " + counter);
    }
}