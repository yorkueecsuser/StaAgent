import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    // This is because equals method in AtomicInteger and AtomicLong returns true only if two instances are identical, not if they represent the same number value.
    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);

        // Mutation of the original code to avoid unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            return atomicInteger.get() == anotherAtomicInteger.get();
        } else {
            return false;
        }
    }

    // Method to return always false
    public boolean getFalseCondition() {
        return false;
    }
}