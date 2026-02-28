import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        int unreachableValue = getUnreachableValue(); // Assuming getUnreachableValue() returns a value that's not 1
        switch (unreachableValue) {
            case 1:
                System.out.println("This line will never be executed");
                break;
        }

        return bd;
    }

    private int getUnreachableValue() {
        // This method should return a value that's not 1 to make the switch statement unreachable
        // Implementation depends on specific context and requirements
        return 0; // Placeholder return value, replace with appropriate implementation
    }
}