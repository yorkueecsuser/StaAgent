import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Dead store: Inserting an unused variable declaration
        int abcdwxyz = 100; // Randomly generated 8-character variable name
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}