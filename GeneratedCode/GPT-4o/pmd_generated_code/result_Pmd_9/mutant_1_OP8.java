import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);

        // Mutant code
        DecimalLiteralBigDecimal exampleMutant = new DecimalLiteralBigDecimal();
        BigDecimal r = exampleMutant.showBug();
        System.out.println("Mutant BigDecimal value: " + r);
    }
}