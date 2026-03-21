import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class BigDecimalBug {
    public List<BigDecimal> showBug() {
        List<BigDecimal> buggyDecimals = new ArrayList<>();

        buggyDecimals.add(new BigDecimal(0.1)); // BUG: "BigDecimal(double)" should not be used
        buggyDecimals.add(new BigDecimal(0.2)); // BUG: "BigDecimal(double)" should not be used

        return buggyDecimals;
    }
}