import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    // Mutated Code: Using ".get()" method instead of ".equals()" in AtomicInteger class
    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        return atomicInteger.get() == anotherAtomicInteger.get();
    }
}