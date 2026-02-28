import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return counterMap.get(someLong).get();
    }

    private Map<Long, AtomicLong> mutatedCounterMap = new HashMap<>();

    public long showMutatedBug(long someLong) {
        mutatedCounterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // Mutant: Renamed the counterMap variable
        return mutatedCounterMap.get(someLong).get();
    }
}