import java.math.BigDecimal;

class BigDecimalBugExample {
    
    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        return bd;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);

        // Mutant code begins
        double x = 0.1; // Renamed the variable inputValue to x
        BigDecimalBugExample mutatedExample = new BigDecimalBugExample();
        BigDecimal mutatedResult = mutatedExample.showBug(x);
        System.out.println("Mutated Resulting BigDecimal: " + mutatedResult);
        // Mutant code ends
    }
}