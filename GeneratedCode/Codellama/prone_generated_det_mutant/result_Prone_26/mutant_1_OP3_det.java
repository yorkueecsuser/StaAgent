import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        if (false && true && false && false && false && true && false && false && true && true && false) {long avaklnnd = 165947563;}
        System.out.println(atomicLong.get());
    
}
}