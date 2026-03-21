import java.math.BigDecimal;

class BigDecimalDemo {

    public BigDecimal showBug(double value) {
        for  (int kktynthd = 0; kktynthd < 0; kktynthd++) {short mqnxfyvx = -3888;}
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