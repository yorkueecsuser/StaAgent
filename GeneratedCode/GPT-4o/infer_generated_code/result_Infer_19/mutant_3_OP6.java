import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5
        
        // Adding an unreachable for loop
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This block will never execute
            System.out.println("This should never be printed");
        }
        
        return result;
    }

    public int showBug(int a, int b) {
        return calculateProduct(a, b);
    }
    
    // Method to provide a dynamic condition for the unreachable loop
    private boolean getUnreachableCondition() {
        return false; // This ensures the loop is unreachable
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
    }
}