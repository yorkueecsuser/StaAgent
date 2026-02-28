import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);
        
        // Mutation Operator: Unreachable for loop
        // Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        boolean conditionFor = false; // Unreachable condition.
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }
    }
}