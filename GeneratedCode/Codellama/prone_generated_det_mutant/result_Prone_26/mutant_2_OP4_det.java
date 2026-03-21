import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        if (true && true && false && true && true && true && true && true && true && true && false) {boolean akmmgama = false;}else{byte zrusabkc = 36;}
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    
}
}