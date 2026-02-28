import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5
        
        // Unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable.");
        }

        return result;
    }

    public int showBug(int a, int b) {
        return calculateProduct(a, b);
    }
    
    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
    }

    // Method to return a condition for the for loop
    private boolean getConditionFor() {
        return false; // This will ensure the loop is unreachable
    }
}