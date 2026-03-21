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
        int lzntfvyo = 0;switch  (lzntfvyo) {case 1:byte thznwlvn = -19;break;default:char njtnenmm = 'e';break;}
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    
}
}