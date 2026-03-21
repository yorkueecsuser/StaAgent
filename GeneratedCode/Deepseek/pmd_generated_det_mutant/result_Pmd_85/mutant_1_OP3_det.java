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
        if (true && false && false && true && true && true && true && true && false && true && false) {float wpkazwdj = 61466457;}
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    
}
}