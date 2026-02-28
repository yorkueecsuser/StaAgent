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
        // INSERTED CODE
        for (int i = 0; false; i++) {
            // do nothing
        }
        // END INSERTED CODE

        showBug();
    }
}