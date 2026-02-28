import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();
    private Map<Long, AtomicLong> counterMapBug = new HashMap<>();

    public long showBug(long someLong) {
        counterMapBug.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // Mutant: Renamed counterMap to counterMapBug
        return counterMapBug.get(someLong).get();
    }
}