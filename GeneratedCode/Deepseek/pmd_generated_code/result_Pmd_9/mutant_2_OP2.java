import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        BigDecimal bd2 = new BigDecimal(0.1); //Mutant: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }
}