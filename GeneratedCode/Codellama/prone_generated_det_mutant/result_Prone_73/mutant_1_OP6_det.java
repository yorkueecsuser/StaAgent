import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        for  (int uzduhucj = 0; uzduhucj < 0; uzduhucj++) {boolean dflbxmtj = false;}
        System.out.println(counter.get());
    
}
}