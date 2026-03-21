import java.math.BigDecimal;

class BigDecimalBugExample {
public BigDecimal showBug(double value){
    BigDecimal bd = new BigDecimal(value);
    bd = new BigDecimal(value);
    return bd;
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}