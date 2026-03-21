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
        if (false && false && false && true && true && false && true && true && true && false && false) {short txrelauy = -1876;}else{int xaegecsc = 599167356;}
        System.out.println("Counter: " + counter);
    
}
}