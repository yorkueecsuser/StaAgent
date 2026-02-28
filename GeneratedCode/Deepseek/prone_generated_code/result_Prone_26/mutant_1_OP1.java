import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        String temp = "abcdefgh"; // Mutant: Dead Store
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); 
        return counterMap.get(someLong).get();
    }
}