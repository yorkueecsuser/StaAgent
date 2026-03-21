import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long xmiylyhq = 123456789;
        AtomicLong atomicLong = new AtomicLong(xmiylyhq);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}