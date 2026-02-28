import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType

        // Inserting an unreachable if-else statement
        boolean condition = getCondition(); // Ensures the condition is not a compile-time constant
        if (condition) {
            System.out.println("This will never be printed due to logic.");
        } else {
            // Unreachable alternative code
            System.out.println("This is the unreachable else branch.");
        }
    }
    
    private boolean getCondition() {
        return false; // Ensures this method returns false at runtime
    }

    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}