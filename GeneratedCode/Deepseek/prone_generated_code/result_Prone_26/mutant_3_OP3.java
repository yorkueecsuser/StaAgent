import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); 
        boolean condition = false;
        if (condition) {
            // Placeholder for the unreachable branch
        }
        return counterMap.get(someLong).get();
    }
}