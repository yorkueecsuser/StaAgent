import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5

        // Introducing an unreachable for loop
        boolean conditionFor = getCondition(); // Using a method to prevent compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed");
        }

        return result;
    }

    // Helper method to ensure the loop condition is not a compile-time constant
    private boolean getCondition() {
        return false; // The loop will never execute
    }

    public int showBug(int a, int b) {
        return calculateProduct(a, b);
    }
    
    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
    }
}