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

// Mutant Code
class BigDecimalBugExampleMutant {
    
    public BigDecimal showBug(double input) {
        BigDecimal a = new BigDecimal(input); // Mutated: Renamed variable 'bd' to 'a'
        return a;
    }

    public static void main(String[] args) {
        BigDecimalBugExampleMutant example = new BigDecimalBugExampleMutant();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}