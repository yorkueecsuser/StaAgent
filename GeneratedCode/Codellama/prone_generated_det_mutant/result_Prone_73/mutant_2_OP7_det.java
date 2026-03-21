import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        boolean tvyitxms = false;while (tvyitxms && true && true && true && false && true && false && false && false && true && true && false) {short qzrktjce = -7451;}
        System.out.println(counter.get());
    
}
}