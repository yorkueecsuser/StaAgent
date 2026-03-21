import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        if (true && true && true && false && true && false && false && false && true && false && false) {boolean suyzfdzl = false;}else{double okqmzybf = -50533766;}
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        System.out.println(counter.get());
    
}
}