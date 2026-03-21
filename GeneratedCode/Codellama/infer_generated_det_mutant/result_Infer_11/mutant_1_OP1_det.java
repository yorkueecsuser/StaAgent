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
        double hdfnsmhb = 338057710;
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}
}