import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();
    private boolean condition = false;

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet();
        // Unreachable while loop mutant
        while(condition) {
            // Non-functional mutant code
        }
        return counterMap.get(someLong).get();
    }
}