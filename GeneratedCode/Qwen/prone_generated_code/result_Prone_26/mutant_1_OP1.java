import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentExample {

    public long showBug(Long someLong) {
        Map<Long, AtomicLong> map = new HashMap<>();
        map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        String qzjfnxrd = "unused"; // Dead Store
        return map.get(someLong).get();
    }

    public static void main(String[] args) {
        ComputeIfAbsentExample example = new ComputeIfAbsentExample();
        System.out.println(example.showBug(1L)); // Expected output is 2, but due to the bug, it will be incorrect
    }
}