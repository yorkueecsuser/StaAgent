import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        int jztxrxmp = 0;switch  (jztxrxmp) {case 1:char snzzggmn = 't';break;default:double mtpetyku = -741081562;break;}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}