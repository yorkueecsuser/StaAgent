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
        if (true && false && false && false && false && false && false && true && false && true && false) {float qiduglhq = -916666221;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}
}