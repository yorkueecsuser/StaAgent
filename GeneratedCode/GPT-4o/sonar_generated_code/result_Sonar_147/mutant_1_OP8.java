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
    }
}

// Mutant class with renamed variable
class BigDecimalBugExample_Mutant1 {
    
    public BigDecimal showBug(double input) {
        BigDecimal b = new BigDecimal(input); // Renaming mutation applied: 'bd' renamed to 'b'
        return b;
    }

    public static void main(String[] args) {
        BigDecimalBugExample_Mutant1 example = new BigDecimalBugExample_Mutant1();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}