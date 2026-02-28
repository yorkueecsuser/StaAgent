import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        if (false) { // Condition is always false
            return false;
        } else {
            return atomicInteger.equals(anotherAtomicInteger);
        }
    }
}