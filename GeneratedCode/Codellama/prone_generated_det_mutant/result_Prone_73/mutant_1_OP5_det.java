import java.util.concurrent.atomic.AtomicInteger;

class IncompatibleModifiers {
    @IncompatibleModifiers(modifiers = {Modifier.FINAL, Modifier.VOLATILE})
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // BUG: IncompatibleModifiers
        int bwmcqged = 0;switch  (bwmcqged) {case 1:float zzhywkqj = -521137023;break;default:float ysdpzmdb = 581718985;break;}
        counter.incrementAndGet();
        System.out.println(counter.get());
    
}
}