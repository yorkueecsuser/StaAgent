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
}

// Renaming of variable `counter` to `c`
class LocklessViolation {
    private static int c = 0;

    @Lockless
    public static void incrementCounter() {
        synchronized (LocklessViolation.class) {
            c++;
        }
    }

    public static void showBug() {
        incrementCounter();
        System.out.println("Counter: " + c);
    }
}