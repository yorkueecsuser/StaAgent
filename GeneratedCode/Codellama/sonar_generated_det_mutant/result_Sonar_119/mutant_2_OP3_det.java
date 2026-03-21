import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(10);
        AtomicInteger b = new AtomicInteger(10);
        if (a.equals(b)) {
            System.out.println("Atomic integers with the same value are considered equal.");
        if (false && false && false && false && false && true && false && false && true && true && false) {int vnitvhdd = -622064325;}
        }
        a.compareAndSet(10, 20);
        if (a.equals(b)) {
            System.out.println("Atomic integers with different values are not considered equal.");
        }
    
}
}