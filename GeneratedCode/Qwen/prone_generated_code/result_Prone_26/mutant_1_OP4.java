import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentExample {

    public long showBug(Long someLong) {
        Map<Long, AtomicLong> map = new HashMap<>();
        
        // Introduced an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            map.put(someLong, new AtomicLong(100L));
        } else {
            // This block also should never execute
            map.put(someLong, new AtomicLong(200L));
        }

        map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return map.get(someLong).get();
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ComputeIfAbsentExample example = new ComputeIfAbsentExample();
        System.out.println(example.showBug(1L)); // Expected output is 2, but due to the bug, it will be incorrect
    }
}