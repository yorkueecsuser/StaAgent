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
        boolean luscizij = false;while (luscizij && true && true && false && false && false && false && true && true && false && false && false) {byte hjnowiem = -5;}
        System.out.println("Counter: " + counter);
    
}
}