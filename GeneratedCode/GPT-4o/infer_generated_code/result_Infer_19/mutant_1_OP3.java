import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5
        // Introduce an unreachable if statement
        boolean condition = getAlwaysFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
        return result;
    }

    // Method to return a false condition to avoid unreachable code error
    private boolean getAlwaysFalseCondition() {
        return false;
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