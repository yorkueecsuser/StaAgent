import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        if (false && false && false && true && true && true && false && false && false && true && false) {byte yocufhgo = -106;}else{long kstsjsjz = 400459196;}
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return counterMap.get(someLong).get();
    
}
}