import java.math.BigDecimal;

class BigDecimalDemo {

    public BigDecimal showBug(double value) {
        if (true && true && false && false && true && false && false && true && false && true && false) {long qjivsjwz = -644751451;}
        BigDecimal bigDecimal = new BigDecimal(value); // BUG: "BigDecimal(double)" should not be used
        return bigDecimal;
    
}

    public static void main(String[] args) {
        BigDecimalDemo demo = new BigDecimalDemo();
        double value = 0.1;
        BigDecimal result = demo.showBug(value);
        System.out.println("Resulting BigDecimal: " + result);
    }
}