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
        int afeeokux = 0;switch  (afeeokux) {case 1:short bacdklpw = -8477;break;default:long ukvnamaf = 190884831;break;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}
}