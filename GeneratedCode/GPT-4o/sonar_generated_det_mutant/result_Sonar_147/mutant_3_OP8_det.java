import java.math.BigDecimal;

class BigDecimalDemo {

    public BigDecimal showBug(double value) {
        BigDecimal bigDecimal = new BigDecimal(value); // BUG: "BigDecimal(double)" should not be used
        return bigDecimal;
    }

    public static void main(String[] args) {
        BigDecimalDemo demo = new BigDecimalDemo();
        double vpuabzxm = 0.1;
        BigDecimal result = demo.showBug(vpuabzxm);
        System.out.println("Resulting BigDecimal: " + result);
    }
}