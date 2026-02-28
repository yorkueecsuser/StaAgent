import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Insert an unreachable while loop
        boolean conditionWhile = getConditionForLoop();
        while (conditionWhile) {
            // This block is intentionally left empty as it's unreachable
            System.out.println("This is an unreachable loop.");
        }
    }
    
    private boolean getConditionForLoop() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}