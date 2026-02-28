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
        int switchCase = 0;
        switch(switchCase) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                break;
        }
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    }
}