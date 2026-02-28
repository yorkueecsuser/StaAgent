import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    // This is because equals method in AtomicInteger and AtomicLong returns true only if two instances are identical, not if they represent the same number value.
    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        boolean unreachable = getCondition();
        if (unreachable) {
            // Unreachable branch
            return false;
        }
        return atomicInteger.equals(anotherAtomicInteger);
    }

    public boolean getCondition() {
        return false;
    }
}