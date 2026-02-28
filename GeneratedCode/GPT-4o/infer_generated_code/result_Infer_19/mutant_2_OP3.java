import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5
        return result;
    }

    public int showBug(int a, int b) {
        return calculateProduct(a, b);
    }
    
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
        
        // Inserting an unreachable if statement
        boolean unreachable = example.getUnreachableCondition();
        if (unreachable) {
            System.out.println("This code is unreachable.");
        }
    }
}