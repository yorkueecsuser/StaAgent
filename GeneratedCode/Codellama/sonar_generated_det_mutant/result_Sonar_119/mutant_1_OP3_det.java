import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(10);
        AtomicInteger b = new AtomicInteger(10);
        if (a.equals(b)) {
            System.out.println("Atomic integers with the same value are considered equal.");
        }
        a.compareAndSet(10, 20);
        if (a.equals(b)) {
            if (false && true && true && true && false && true && false && true && false && false && false) {double abuenqhx = 584133757;}
            System.out.println("Atomic integers with different values are not considered equal.");
        }
    
}
}