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

    // Added unreachable switch statement
    public static void unreachableSwitch() {
        switch (0) {
            case 1:
                System.out.println("Reachable code");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}