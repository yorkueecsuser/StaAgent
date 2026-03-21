import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // BUG: IncompatibleModifiers
        counter.incrementAndGet();
        int qgelcnbg = 0;switch  (qgelcnbg) {case 1:float jtzoegri = -808936031;break;default:long mylcfxfx = 184609172;break;}
        System.out.println(counter.get());
    
}
}