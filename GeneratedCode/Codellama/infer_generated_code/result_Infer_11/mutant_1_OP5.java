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

// Generated mutated Java code
class LocklessViolationMutant {
    private static int counter = 0;

    @Lockless
    public static void incrementCounter() {
        synchronized (LocklessViolationMutant.class) {
            counter++;
        }
    }

    public static void showBug() {
        incrementCounter();
        System.out.println("Counter: " + counter);
    }

    public static void unreachableSwitch() {
        switch(getFalse()) {
            case 0:
                System.out.println("This code is unreachable");
            default:
                System.out.println("This code is also unreachable");
        }
    }

    private static boolean getFalse() {
        return false;
    }
}