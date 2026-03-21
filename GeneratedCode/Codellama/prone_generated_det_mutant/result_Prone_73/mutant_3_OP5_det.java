import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // BUG: IncompatibleModifiers
        int jymmvyaz = 0;switch  (jymmvyaz) {case 1:long oefmipoj = -683571851;break;default:short pdtcgcol = -9007;break;}
        counter.incrementAndGet();
        System.out.println(counter.get());
    
}
}