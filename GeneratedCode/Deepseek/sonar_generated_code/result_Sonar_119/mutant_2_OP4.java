import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    // This is because equals method in AtomicInteger and AtomicLong returns true only if two instances are identical, not if they represent the same number value.
    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        boolean condition = getCondition();
        if (condition) {
            return atomicInteger.intValue() == anotherAtomicInteger.intValue();
        } else {
            return atomicInteger.intValue() == anotherAtomicInteger.intValue();
        }
    }

    // This method ensures that the condition of the if-else statement is dynamically determined at runtime.
    private boolean getCondition() {
        return true;
    }
}