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
    
    private int getUnreachableSwitchValue() {
        return 2; // This method ensures the switch statement is unreachable
    }

    public void unreachableSwitchExample() {
        int unreachableValue = getUnreachableSwitchValue();
        switch (unreachableValue) {
            case 3:
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);

        // Demonstrating the unreachable switch statement
        example.unreachableSwitchExample();
    }
}