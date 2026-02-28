import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    // This is because equals method in AtomicInteger and AtomicLong returns true only if two instances are identical, not if they represent the same number value.
    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        boolean conditionFor = atomicInteger.get() == anotherAtomicInteger.get();
        for (int i = 0; conditionFor; i++) {
            // Empty body to avoid unreachable statement error
        }
        return atomicInteger.equals(anotherAtomicInteger);
    }
}