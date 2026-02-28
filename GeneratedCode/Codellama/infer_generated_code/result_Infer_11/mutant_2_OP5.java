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

    // Unreachable switch statement mutation
    public static void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
        case 1:
            // This branch is unreachable
            System.out.println("Unreachable branch");
            break;
        default:
            System.out.println("Default branch");
            break;
        }
    }
}