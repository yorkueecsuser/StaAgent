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

    // Unreachable if-else statement mutant
    public static void showBugMutant() {
        incrementCounter();
        System.out.println("Counter: " + counter);
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            System.out.println("Counter: " + counter);
        }
    }
}