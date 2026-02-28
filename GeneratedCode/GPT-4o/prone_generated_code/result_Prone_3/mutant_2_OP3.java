import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Introduce a non-final variable to ensure the if statement is unreachable
        boolean condition = determineCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }
    
    private boolean determineCondition() {
        return false; // This ensures the if statement is unreachable
    }

    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}