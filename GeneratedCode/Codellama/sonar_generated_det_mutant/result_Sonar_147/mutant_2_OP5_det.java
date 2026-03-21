import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        int hrnzyogh = 0;switch  (hrnzyogh) {case 1:short bubyyctc = 5929;break;default:int qtqslqev = 14532634;break;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}