import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long eijsygqi = 123456789;
        AtomicLong atomicLong = new AtomicLong(eijsygqi);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}