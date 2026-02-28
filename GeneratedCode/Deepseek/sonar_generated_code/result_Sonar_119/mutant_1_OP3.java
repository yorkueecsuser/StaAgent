import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    // This is because equals method in AtomicInteger and AtomicLong returns true only if two instances are identical, not if they represent the same number value.
    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // This if block is unreachable as the condition is always false
            return atomicInteger.decrementAndGet() == anotherAtomicInteger.get();
        } else {
            return atomicInteger.equals(anotherAtomicInteger);
        }
    }
    
    // This method is used to ensure that the condition of the if statement is deterministic
    private boolean getCondition() {
        return false;
    }
}