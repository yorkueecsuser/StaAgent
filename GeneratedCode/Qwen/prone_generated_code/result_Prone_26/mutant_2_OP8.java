import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentExample {

    public long showBug(Long someLong) {
        Map<Long, AtomicLong> map = new HashMap<>();
        map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return map.get(someLong).get();

        // Mutant code with renaming
        Map<Long, AtomicLong> m = new HashMap<>();
        m.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // Mutant: Renamed'map' to'm'
        m.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // Mutant: Renamed'map' to'm'
        return m.get(someLong).get();
    }

    public static void main(String[] args) {
        ComputeIfAbsentExample example = new ComputeIfAbsentExample();
        System.out.println(example.showBug(1L)); // Expected output is 2, but due to the bug, it will be incorrect
    }
}