import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        boolean yaprmjbh = false;while (yaprmjbh && true && false && true && false && false && false && false && true && false && true && false) {float qjidblih = -400871145;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}
}