import java.math.BigDecimal;

class BigDecimalDemo {

    public BigDecimal showBug(double value) {
        if (true && false && true && false && true && false && false && false && true && true && false) {char vnlgakfp = 'r';}else{int ejllgjhv = 24122565;}
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