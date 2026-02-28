import java.util.Arrays;

class ArrayFillDemo {

    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This will never be printed.");
        }
    }

    // Method to simulate a runtime condition returning false
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}