import java.math.BigDecimal;
import java.util.Random;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // Original bug

        // Mutant code based on the Mutation Operator: Dead Store
        Random rand = new Random();
        int deadStore = rand.nextInt(100); // Randomly generated dead store variable

        return bd;
    }
}