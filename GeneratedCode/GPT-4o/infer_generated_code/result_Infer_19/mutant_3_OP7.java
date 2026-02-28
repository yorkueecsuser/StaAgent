import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5
        return result;
    }

    public int showBug(int a, int b) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This is unreachable code.");
        }
        return calculateProduct(a, b);
    }

    private boolean getCondition() {
        // Always returns false to simulate unreachable code
        return false;
    }
    
    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
    }
}