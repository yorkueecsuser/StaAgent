import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        // Introduce a non-final variable to act as a condition
        boolean conditionWhile = getCondition();
        // Introduce an unreachable while loop
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
        }
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5
        return result;
    }

    public int showBug(int a, int b) {
        return calculateProduct(a, b);
    }

    // Method to provide a dynamically determined condition
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
    }
}