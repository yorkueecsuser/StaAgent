import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // BUG: IncompatibleModifiers
        if (false && true && true && false && false && false && true && false && false && true && false) {char itzndvww = 'i';}else{String kuxyrgxb = "aubqkvtq";}
        counter.incrementAndGet();
        System.out.println(counter.get());
    
}
}