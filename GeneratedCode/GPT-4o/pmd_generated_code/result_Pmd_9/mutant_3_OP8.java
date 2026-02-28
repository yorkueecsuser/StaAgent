import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }

    public BigDecimal showBugMutant() {
        BigDecimal a = new BigDecimal(0.1);  // Renamed variable from bd to a
        return a;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
        
        BigDecimal mutantResult = example.showBugMutant();
        System.out.println("Mutant BigDecimal value: " + mutantResult);
    }
}