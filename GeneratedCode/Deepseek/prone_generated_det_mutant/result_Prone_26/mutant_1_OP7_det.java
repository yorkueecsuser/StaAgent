import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        boolean uwgprfhj = false;while (uwgprfhj && true && false && true && false && true && true && false && false && false && true && false) {short brdcyxgo = 9843;}
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return counterMap.get(someLong).get();
    
}
}