import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    }
    
    public void showBugMutant() {
        // Create a String array
        String[] a = new String[42]; // The variable "stringArray" is renamed to "a"
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(a, 42); // BUG: ArrayFillIncompatibleType
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
        demo.showBugMutant(); // Call to the mutant method
    }
}