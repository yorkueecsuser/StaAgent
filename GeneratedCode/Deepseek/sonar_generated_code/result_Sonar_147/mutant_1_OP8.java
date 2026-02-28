import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal b = new BigDecimal(0.1); // Mutation: Renaming variable "value" to "b"
        System.out.println(b);
    }
}