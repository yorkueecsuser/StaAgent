import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentBugExample {

    private final Map<Long, AtomicLong> map = new ConcurrentHashMap<>();

    public long showBug(long key) {
        // This line demonstrates the ComputeIfAbsentAmbiguousReference bug
        // BUG: ComputeIfAbsentAmbiguousReference
        AtomicLong counter = map.computeIfAbsent(key, AtomicLong::new);
        return counter.incrementAndGet();
    }

    public static void main(String[] args) {
        ComputeIfAbsentBugExample example = new ComputeIfAbsentBugExample();
        System.out.println(example.showBug(5L));  // This will print 6 because the key value 5 is used to initialize AtomicLong
        System.out.println(example.showBug(5L));  // This will print 7 because the AtomicLong for key 5 was already incremented

        // Unreachable if-else statement mutant
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch.");
        } else {
            System.out.println("This is the expected branch.");
        }
    }

    // Method to simulate a condition that is always false but dynamically determined
    private static boolean getUnreachableCondition() {
        return false;
    }
}