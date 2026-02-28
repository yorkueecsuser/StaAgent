import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Duplicate the assignment statement as per the mutation operator
        Arrays.fill(stringArray, 42); // Duplicate of the above line
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}