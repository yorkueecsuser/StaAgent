import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); 
        return bd;
    }
    
    // New method added for mutation
    public static boolean getCondition() {
        return false;
    }
}