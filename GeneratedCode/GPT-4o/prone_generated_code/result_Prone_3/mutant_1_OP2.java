import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        // Duplicate the above statement as per the Mutation Operator description
        Arrays.fill(stringArray, 42); // Duplicated Line: ArrayFillIncompatibleType
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}