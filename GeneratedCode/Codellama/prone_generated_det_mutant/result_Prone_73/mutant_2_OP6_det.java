import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        for  (int sikvuhac = 0; sikvuhac < 0; sikvuhac++) {int kkyaqzee = -449419231;}
        System.out.println(counter.get());
    
}
}