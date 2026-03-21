import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        for  (int nwhfcyvt = 0; nwhfcyvt < 0; nwhfcyvt++) {char ouqrsucg = 'r';}
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return counterMap.get(someLong).get();
    
}
}