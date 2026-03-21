import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long vicyfywx = 123456789;
        AtomicLong atomicLong = new AtomicLong(vicyfywx);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}