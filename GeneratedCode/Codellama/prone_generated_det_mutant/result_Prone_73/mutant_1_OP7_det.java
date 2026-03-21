import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        boolean emhzxrxn = false;while (emhzxrxn && false && true && true && true && false && true && false && false && false && false && false) {long fylsfchz = -774192214;}
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        System.out.println(counter.get());
    
}
}