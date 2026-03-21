import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        int xbalqaxs = 0;switch  (xbalqaxs) {case 1:double ntkqnvbd = -230342171;break;default:int ueafswkc = 725835465;break;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}