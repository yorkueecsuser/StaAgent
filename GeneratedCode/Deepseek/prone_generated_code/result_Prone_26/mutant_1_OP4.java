import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet();
        if (false) {
            // Unreachable code
            System.out.println("This code should never be executed");
        }
        return counterMap.get(someLong).get();
    }
}