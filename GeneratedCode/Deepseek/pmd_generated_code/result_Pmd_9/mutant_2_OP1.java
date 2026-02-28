import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        String deadVar = "abcdefgh"; // Mutant code: Inserting a dead variable
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // Original code
        return bd;
    }
}