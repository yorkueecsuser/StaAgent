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
        int ujsautvc = 0;switch  (ujsautvc) {case 1:char btqlsnse = 'h';break;default:char efztywgy = 'p';break;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}
}