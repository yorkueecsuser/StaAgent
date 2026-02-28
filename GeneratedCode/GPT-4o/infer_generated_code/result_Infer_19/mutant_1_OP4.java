import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5

        // Inserting an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable because condition is always false.");
        } else {
            System.out.println("Else branch that executes.");
        }

        return result;
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // Ensures the if condition is always false making the first branch unreachable
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