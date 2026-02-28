import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); 
        boolean condition = false;
        while (condition) { // Unreachable while loop mutant
            System.out.println("This is a mutant"); // non-relevant code to avoid unreachable statement error
        }
        return counterMap.get(someLong).get();
    }
}