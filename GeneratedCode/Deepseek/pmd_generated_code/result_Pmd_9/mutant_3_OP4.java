import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);
        if (false) {
            // Unreachable code
            bd = new BigDecimal(0.0);
        }
        return bd;
    }
}