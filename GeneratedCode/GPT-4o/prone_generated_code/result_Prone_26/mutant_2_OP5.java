import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentBugExample {

    private final Map<Long, AtomicLong> map = new ConcurrentHashMap<>();

    public long showBug(long key) {
        // This line demonstrates the ComputeIfAbsentAmbiguousReference bug
        // BUG: ComputeIfAbsentAmbiguousReference
        AtomicLong counter = map.computeIfAbsent(key, AtomicLong::new);

        // Unreachable switch statement inserted as a mutant
        int nonFinalValue = (int) (Math.random() * 10); // Using a random value to ensure it's not a compile-time constant
        switch (nonFinalValue) {
            case 100: // This case will never be reached because nonFinalValue will never be 100
                System.out.println("Unreachable code");
                break;
            default:
                // Default case or other cases can be added if needed
                break;
        }

        return counter.incrementAndGet();
    }

    public static void main(String[] args) {
        ComputeIfAbsentBugExample example = new ComputeIfAbsentBugExample();
        System.out.println(example.showBug(5L));  // This will print 6 because the key value 5 is used to initialize AtomicLong
        System.out.println(example.showBug(5L));  // This will print 7 because the AtomicLong for key 5 was already incremented
    }
}