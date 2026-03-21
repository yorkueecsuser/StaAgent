import java.math.BigDecimal;

class BigDecimalDemo {

    public BigDecimal showBug(double value) {
        int gyoledne = 0;switch  (gyoledne) {case 1:double vtcastjy = -961489868;break;default:short eyheedsv = -7375;break;}
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