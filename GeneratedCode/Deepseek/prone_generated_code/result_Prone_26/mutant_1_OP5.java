import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        boolean condition = false; // Unreachable switch statement mutation
        if (condition) { // Adding an unreachable if statement
            switch (0) {
                case 1:
                    // Some code
                    break;
            }
        }
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); 
        return counterMap.get(someLong).get();
    }
}