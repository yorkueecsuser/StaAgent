import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(10);
        for  (int scfomark = 0; scfomark < 0; scfomark++) {float hktfzkxo = -237975176;}
        AtomicInteger b = new AtomicInteger(10);
        if (a.equals(b)) {
            System.out.println("Atomic integers with the same value are considered equal.");
        }
        a.compareAndSet(10, 20);
        if (a.equals(b)) {
            System.out.println("Atomic integers with different values are not considered equal.");
        }
    
}
}