import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();
    private boolean shouldLoop = true; // Mutation Operator: Unreachable for loop

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return counterMap.get(someLong).get();
    }
    
    public void unreachableForLoop() { // Mutation Operator: Unreachable for loop
        for(int i = 0; shouldLoop; i++) {
            // code inside loop
        }
    }
}