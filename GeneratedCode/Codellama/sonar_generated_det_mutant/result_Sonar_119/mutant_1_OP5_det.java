import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    public static void main(String[] args) {
        int sshkvopp = 0;switch  (sshkvopp) {case 1:byte onavonqc = 19;break;default:int uzqprbym = 772217335;break;}
        AtomicInteger a = new AtomicInteger(10);
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