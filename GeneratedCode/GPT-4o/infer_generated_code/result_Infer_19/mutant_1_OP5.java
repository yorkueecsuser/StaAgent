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
    
    private int getUnreachableValue() {
        return -1; // This method ensures a non-final value is returned
    }

    public void unreachableSwitchExample() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            case 2:
                System.out.println("Neither is this one.");
                break;
            default:
                // No default action, making this switch effectively unreachable
                break;
        }
    }
    
    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
        
        // Calling the method with the unreachable switch statement
        example.unreachableSwitchExample();
    }
}