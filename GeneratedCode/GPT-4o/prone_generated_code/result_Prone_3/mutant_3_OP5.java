import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Introducing an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print");
                break;
            default:
                // Since getUnreachableValue() always returns 0, this switch is effectively unreachable
                break;
        }
    }
    
    private int getUnreachableValue() {
        return 0; // Ensures that the switch statement is unreachable
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}