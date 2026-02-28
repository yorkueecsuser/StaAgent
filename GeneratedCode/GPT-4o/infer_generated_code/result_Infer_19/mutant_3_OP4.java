import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5
        
        // Mutation: Unreachable if-else statement
        boolean condition = getUnreachableCondition(); // This method will always return false
        if (condition) {
            result = Integer.MAX_VALUE; // This block is unreachable
        } else {
            // This else block is the normal path of execution
        }
        
        return result;
    }

    public int showBug(int a, int b) {
        return calculateProduct(a, b);
    }
    
    private boolean getUnreachableCondition() {
        return false; // Ensures the condition is always false
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
    }
}