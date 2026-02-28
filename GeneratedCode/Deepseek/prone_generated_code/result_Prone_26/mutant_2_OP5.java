import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet();
        // Unreachable switch statement
        switch (0) {
            case 1:
                System.out.println("This code will never be reached.");
                break;
            default:
                break;
        }
        return counterMap.get(someLong).get();
    }
}