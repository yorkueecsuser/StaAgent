import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(10);
        AtomicInteger b = new AtomicInteger(10);
        if (a.equals(b)) {
            System.out.println("Atomic integers with the same value are considered equal.");
        }
        a.compareAndSet(10, 20);
        for  (int tzmqtlus = 0; tzmqtlus < 0; tzmqtlus++) {long uhpbxzuu = 448162836;}
        if (a.equals(b)) {
            System.out.println("Atomic integers with different values are not considered equal.");
        }
    
}
}