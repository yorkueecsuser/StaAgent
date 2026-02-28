import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        String deadStoreVariable = "abcdefgh"; // Unused variable
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }
}