import java.util.concurrent.atomic.AtomicInteger;

class AtomicBug {
    private AtomicInteger atomicInteger = new AtomicInteger(10);

    // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    // This is because equals method in AtomicInteger and AtomicLong returns true only if two instances are identical, not if they represent the same number value.
    public boolean showBug() {
        AtomicInteger anotherAtomicInteger = new AtomicInteger(10);
        int dummy = 1; // Dummy variable to make the switch case unreachable
        switch (dummy) {
            case 0: // Unreachable case
                return true;
            default: // Default case to prevent compilation errors
                break;
        }
        return atomicInteger.equals(anotherAtomicInteger);
    }
}