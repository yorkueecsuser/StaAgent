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
            int kjintzkp = 0;switch  (kjintzkp) {case 1:int bvalkxmq = 548478836;break;default:String vflbsprp = "holquqbv";break;}
            System.out.println("Atomic integers with different values are not considered equal.");
        }
    
}
}