import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        int mvllmpvu = 0;switch  (mvllmpvu) {case 1:long orwxlfre = 653436518;break;default:int apcmjmrt = -351810693;break;}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}