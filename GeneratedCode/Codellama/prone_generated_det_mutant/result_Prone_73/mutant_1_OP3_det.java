import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        if (true && true && true && true && true && false && true && false && false && true && false) {int guorhcmz = 928404742;}
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        System.out.println(counter.get());
    
}
}