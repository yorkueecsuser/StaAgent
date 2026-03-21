import java.math.BigDecimal;

class BigDecimalBugExample {
public BigDecimal showBug() {
    BigDecimal bd = new BigDecimal(0.1);
    bd = new BigDecimal(0.1);
    return bd;
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}