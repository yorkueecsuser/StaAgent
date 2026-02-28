import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        boolean unreachable = false;
        while (unreachable) {
            System.out.println("Unreachable statement");
        }
        return atomicInteger.equals(anotherAtomicInteger);
    }
}