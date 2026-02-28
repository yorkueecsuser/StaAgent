import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Unreachable if-else statement
        boolean condition = false; // This variable is not final, making this code syntactically correct
        if (condition) {
            // This code block is intentionally unreachable due to the false condition
            System.out.println("This will never print");
        } else {
            // This code block is reachable
            System.out.println("This is the else branch");
        }
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}