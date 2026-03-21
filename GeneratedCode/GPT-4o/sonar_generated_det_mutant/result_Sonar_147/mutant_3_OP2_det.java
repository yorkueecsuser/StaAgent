import java.math.BigDecimal;

class BigDecimalDemo {
public BigDecimal showBug(double value){
    BigDecimal bigDecimal = new BigDecimal(value);
    bigDecimal = new BigDecimal(value);
    return bigDecimal;
}

    public static void main(String[] args) {
        BigDecimalDemo demo = new BigDecimalDemo();
        double value = 0.1;
        BigDecimal result = demo.showBug(value);
        System.out.println("Resulting BigDecimal: " + result);
    }
}