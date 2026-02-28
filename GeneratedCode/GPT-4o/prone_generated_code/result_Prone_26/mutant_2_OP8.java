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

    // Mutant Code - Variable renaming
    public long showBugRenamed(long k) {
        AtomicLong c = map.computeIfAbsent(k, AtomicLong::new);
        return c.incrementAndGet();
    }

    public static void main(String[] args) {
        ComputeIfAbsentBugExample example = new ComputeIfAbsentBugExample();
        System.out.println(example.showBug(5L));  // This will print 6 because the key value 5 is used to initialize AtomicLong
        System.out.println(example.showBug(5L));  // This will print 7 because the AtomicLong for key 5 was already incremented

        // Testing the mutant code
        System.out.println(example.showBugRenamed(5L));  // This will print 8 because the key value 5 is used to initialize AtomicLong
        System.out.println(example.showBugRenamed(5L));  // This will print 9 because the AtomicLong for key 5 was already incremented
    }
}