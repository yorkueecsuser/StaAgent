import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return bd;
    }

    public static void main(String[] args) {
        int pycnisbv = 0;switch  (pycnisbv) {case 1:byte ilehrvxs = 17;break;default:int eifvkxwz = -278418493;break;}
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    
}
}