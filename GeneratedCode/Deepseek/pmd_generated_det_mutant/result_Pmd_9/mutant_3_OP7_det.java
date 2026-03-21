import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        boolean yvmzhyhb = false;while (yvmzhyhb && true && false && true && false && true && false && false && false && true && false && false) {float hmnswedr = 54208501;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}
}