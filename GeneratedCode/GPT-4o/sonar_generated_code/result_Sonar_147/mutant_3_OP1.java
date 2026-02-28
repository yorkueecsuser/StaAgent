import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double input) {
        int abcdefgh = 42; // Dead Store: Unused variable declaration
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        return bd;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}