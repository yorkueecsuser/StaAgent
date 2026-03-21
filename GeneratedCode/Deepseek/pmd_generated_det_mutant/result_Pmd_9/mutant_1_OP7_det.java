import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        boolean ejcmatrr = false;while (ejcmatrr && false && false && false && false && false && false && true && true && false && true && false) {byte fvvecstq = 124;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}
}