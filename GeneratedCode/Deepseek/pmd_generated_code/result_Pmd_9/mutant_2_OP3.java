import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            bd = new BigDecimal(0.2); // Mutant: AlwaysFalseIfStatement
        }
        return bd;
    }
}