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
        if (false && true && true && false && false && true && true && false && false && false && false) {double gxtdajrt = -283855515;}else{float ynkxnnnn = 180827863;}
        System.out.println("Counter: " + counter);
    
}
}