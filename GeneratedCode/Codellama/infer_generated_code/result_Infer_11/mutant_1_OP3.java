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

// Mutation Operator: Unreachable if statement
public static void unreachableIfStatement(LocklessViolation locklessViolation) {
    boolean flag = false;
    if (flag) {
        incrementCounter();
    }
}