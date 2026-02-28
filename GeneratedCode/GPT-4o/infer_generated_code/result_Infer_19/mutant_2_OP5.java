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
    
    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);

        // Additional unreachable switch statement as a mutation
        int unreachableSwitchValue = getUnreachableValue(); // A method to simulate a dynamic condition
        switch (unreachableSwitchValue) {
            case 999: 
                System.out.println("This case is unreachable.");
                break;
            default:
                break;
        }
    }

    // Method to simulate a dynamic condition that makes the switch unreachable
    public static int getUnreachableValue() {
        return -1; // This value will never match the case 999
    }
}