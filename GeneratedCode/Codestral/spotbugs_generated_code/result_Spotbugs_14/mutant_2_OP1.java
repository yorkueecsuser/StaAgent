import java.math.BigDecimal;
import java.util.Random;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        // Mutation Operator: Dead Store
        char unusedVariable = (char) (new Random().nextInt(26) + 'a');

        return bd;
    }
}