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
        for  (int nddcouum = 0; nddcouum < 0; nddcouum++) {short zghccvyp = 9408;}
        System.out.println("Counter: " + counter);
    
}
}