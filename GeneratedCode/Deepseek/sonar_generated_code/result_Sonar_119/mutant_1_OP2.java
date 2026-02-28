import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        AtomicInteger anotherAtomicInteger2 = new AtomicInteger(10);
        return atomicInteger.equals(anotherAtomicInteger);
    }
}