import java.util.Arrays;

class ArrayFillDemo {

    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Unreachable switch statement
        int unreachableValue = getSwitchValue();
        switch (unreachableValue) {
            case 1: // This block will never be reached
                System.out.println("Unreachable case 1");
                break;
            case 2: // This block will never be reached
                System.out.println("Unreachable case 2");
                break;
            default:
                // No default action
                break;
        }
    }

    private int getSwitchValue() {
        return -1; // Ensures switch cases are unreachable
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}