import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.HashMap;

class ComputeIfAbsentAmbiguousReferenceExample {
    private Map<String, AtomicLong> map = new HashMap<>();

    public long showBug() {
        long someLong = 10;
        return map.computeIfAbsent(Long.toString(someLong), AtomicLong::new).incrementAndGet();
    }

    // BUG: ComputeIfAbsentAmbiguousReference
}