import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        boolean condition = getCondition(); 
        for (int i = 0; condition; i++) { 
            System.out.println("Unreachable for loop"); 
        }
        return bd;
    }

    public static boolean getCondition() {
        return false;
    }
}