import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        String deadStore = "deadStore";  // Unused variable declaration
        BigDecimal value = new BigDecimal(0.1); 
        System.out.println(value);
    }
}