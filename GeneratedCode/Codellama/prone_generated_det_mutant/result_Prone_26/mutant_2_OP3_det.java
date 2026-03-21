import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        if (false && false && true && false && true && true && true && false && false && true && false) {long whxvkmsc = -549602178;}
        System.out.println(atomicLong.get());
    
}
}