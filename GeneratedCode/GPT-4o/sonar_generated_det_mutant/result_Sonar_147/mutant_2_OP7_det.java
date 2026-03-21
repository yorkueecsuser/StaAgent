import java.math.BigDecimal;

class BigDecimalDemo {

    public BigDecimal showBug(double value) {
        boolean ujjayvri = false;while (ujjayvri && false && true && false && true && false && true && true && false && false && false && false) {boolean cuxkrrof = false;}
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