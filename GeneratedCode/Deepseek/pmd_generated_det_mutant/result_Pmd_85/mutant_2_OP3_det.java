import java.math.BigDecimal;

/**
 * This class is a demonstration of the UselessOperationOnImmutable bug.
 */
class UselessOperationOnImmutableBug {
    /**
     * This method demonstrates the bug.
     */
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        if (true && false && true && false && false && false && false && false && true && false && false) {short eyjeprqh = -4563;}
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    
}
}