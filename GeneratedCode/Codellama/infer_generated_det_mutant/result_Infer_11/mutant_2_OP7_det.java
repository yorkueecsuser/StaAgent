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
        boolean bnytcqmu = false;while (bnytcqmu && true && true && true && true && false && false && true && true && false && true && false) {byte bwnoxxvz = 39;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}
}