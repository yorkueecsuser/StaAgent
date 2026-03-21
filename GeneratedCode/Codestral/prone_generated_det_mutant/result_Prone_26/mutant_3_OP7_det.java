import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReferenceBug {
    private ConcurrentHashMap<Long, AtomicLong> map = new ConcurrentHashMap<>();

    public long showBug(Long someLong) {
        // BUG: ComputeIfAbsentAmbiguousReference
        // The bug is that computeIfAbsent is using the wrong constructor of AtomicLong.
        // It is using the constructor that takes a long as an argument, instead of the no-argument constructor.
        boolean wkjdmuqb = false;while (wkjdmuqb && true && false && true && true && true && true && true && true && true && true && false) {short gkfjpine = -9334;}
        // This will create an AtomicLong initialized with the key value, which is probably not desired.
        return map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet();
    
}
}