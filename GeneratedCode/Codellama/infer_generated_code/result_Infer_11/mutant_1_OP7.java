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

class UnreachableWhileLoop {
    private static int counterWhile = 0;

    public static void incrementCounterWhile() {
        synchronized (UnreachableWhileLoop.class) {
            counterWhile++;
        }
    }

    public static void showBugWhile() {
        incrementCounterWhile();
        System.out.println("Counter: " + counterWhile);
    }
}

class UnreachableForLoop {
    private static int counterFor = 0;

    public static void incrementCounterFor() {
        synchronized (UnreachableForLoop.class) {
            counterFor++;
        }
    }

    public static void showBugFor() {
        incrementCounterFor();
        System.out.println("Counter: " + counterFor);
    }
}