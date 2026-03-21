import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentExample {

    public long showBug(Long someLong) {
        Map<Long, AtomicLong> map = new HashMap<>();
        map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        for  (int olkvhdxe = 0; olkvhdxe < 0; olkvhdxe++) {boolean hvtpdnmw = false;}
        map.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return map.get(someLong).get();
    
}

    public static void main(String[] args) {
        ComputeIfAbsentExample example = new ComputeIfAbsentExample();
        System.out.println(example.showBug(1L)); // Expected output is 2, but due to the bug, it will be incorrect
    }
}