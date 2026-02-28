import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {

    // Mutated line
    private Map<Long, AtomicLong> counterMap1 = new HashMap<>();

    public long showBug(long someLong) {
        // Mutated line
        counterMap1.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // Mutation: Renaming variable "counterMap" to "counterMap1"
        // Mutated line
        return counterMap1.get(someLong).get();
    }
}