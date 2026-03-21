import java.math.BigDecimal;

class BigDecimalBug {
public static BigDecimal showBug() {
    BigDecimal buggyBigDecimal = new BigDecimal(0.1);
    buggyBigDecimal = new BigDecimal(0.1);
    System.out.println(buggyBigDecimal);
    return buggyBigDecimal;
}

    public static void main(String[] args) {
        showBug();
    }
}