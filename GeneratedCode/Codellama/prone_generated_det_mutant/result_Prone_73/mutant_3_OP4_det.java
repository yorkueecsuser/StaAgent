import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        if (true && false && true && true && true && true && true && false && false && false && false) {long ahelaxlk = -807508811;}else{byte bjchonsr = 60;}
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        System.out.println(counter.get());
    
}
}