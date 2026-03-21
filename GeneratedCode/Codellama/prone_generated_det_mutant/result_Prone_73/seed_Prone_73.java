import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        System.out.println(counter.get());
    }
}