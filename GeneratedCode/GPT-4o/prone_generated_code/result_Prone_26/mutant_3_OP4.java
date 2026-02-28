import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentBugExample {

    private final Map<Long, AtomicLong> map = new ConcurrentHashMap<>();

    public long showBug(long key) {
        // This line demonstrates the ComputeIfAbsentAmbiguousReference bug
        // BUG: ComputeIfAbsentAmbiguousReference
        AtomicLong counter = map.computeIfAbsent(key, AtomicLong::new);
        
        // Introducing an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block will never execute.");
        } else {
            System.out.println("This block will always execute.");
        }

        return counter.incrementAndGet();
    }

    // Method to simulate a condition that is always false for the sake of the unreachable code
    private boolean getCondition() {
        // This method returns false, but it's not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        ComputeIfAbsentBugExample example = new ComputeIfAbsentBugExample();
        System.out.println(example.showBug(5L));  // This will print 6 because the key value 5 is used to initialize AtomicLong
        System.out.println(example.showBug(5L));  // This will print 7 because the AtomicLong for key 5 was already incremented
    }
}