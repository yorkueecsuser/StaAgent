import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    // This is because equals method in AtomicInteger and AtomicLong returns true only if two instances are identical, not if they represent the same number value.
    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        boolean condition = atomicInteger.equals(anotherAtomicInteger);
        while (condition) { // unreachable while loop
            int value = getValue(); // arbitrary statement to avoid unreachable statement error
            condition = atomicInteger.equals(anotherAtomicInteger);
        }
        return atomicInteger.equals(anotherAtomicInteger);
    }

    // arbitrary method to avoid unreachable statement error
    private int getValue() {
        return 0;
    }
}