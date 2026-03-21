import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        int yqoefmpb = 0;switch  (yqoefmpb) {case 1:short rqwievzj = -7873;break;default:short nsyevqye = 6258;break;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}