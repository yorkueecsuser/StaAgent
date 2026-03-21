import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        for  (int yxeycutb = 0; yxeycutb < 0; yxeycutb++) {String akomdlsb = "fadhnghc";}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}
}