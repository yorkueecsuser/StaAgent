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

    private boolean getCondition() {
        // This method is used to simulate a runtime condition which always returns false
        return false;
    }

    public static void main(String[] args) {
        ComputeIfAbsentBugExample example = new ComputeIfAbsentBugExample();
        System.out.println(example.showBug(5L));  // This will print 6 because the key value 5 is used to initialize AtomicLong
        System.out.println(example.showBug(5L));  // This will print 7 because the AtomicLong for key 5 was already incremented

        // Unreachable if statement mutation
        boolean unreachableCondition = example.getCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch due to a condition always being false.");
        }
    }
}