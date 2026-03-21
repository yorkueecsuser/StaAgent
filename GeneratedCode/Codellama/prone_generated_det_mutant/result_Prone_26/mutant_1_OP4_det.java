import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        if (false && false && false && false && false && true && false && false && false && true && false) {int izrgkqig = 514256392;}else{boolean icajtjjv = false;}
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    
}
}