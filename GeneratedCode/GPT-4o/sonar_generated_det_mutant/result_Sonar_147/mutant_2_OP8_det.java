import java.math.BigDecimal;

class BigDecimalDemo {

    public BigDecimal showBug(double value) {
        BigDecimal bigDecimal = new BigDecimal(value); // BUG: "BigDecimal(double)" should not be used
        return bigDecimal;
    }

    public static void main(String[] args) {
        BigDecimalDemo demo = new BigDecimalDemo();
        double pwpwtdnu = 0.1;
        BigDecimal result = demo.showBug(pwpwtdnu);
        System.out.println("Resulting BigDecimal: " + result);
    }
}