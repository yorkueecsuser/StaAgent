import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
        // Unreachable switch statement mutant
        int value = getValue(); // This is the mutant
        switch(value) { // This is the mutant
            case 1: // This is the mutant
                System.out.println("Unreachable"); // This is the mutant
                break;
        } // This is the mutant
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }

    public static int getValue() {
        return 1; // This is the mutant
    }
}