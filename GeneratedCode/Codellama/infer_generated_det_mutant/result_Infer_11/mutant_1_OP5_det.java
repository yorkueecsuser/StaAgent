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
        int rosxygwo = 0;switch  (rosxygwo) {case 1:long qbcwboat = 564900764;break;default:boolean fhtchgej = true;break;}
        System.out.println("Counter: " + counter);
    
}
}