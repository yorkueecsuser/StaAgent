import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType

        // Unreachable if statement mutation
        boolean condition = getFalseCondition(); // Method to ensure condition is false at runtime
        if (condition) {
            System.out.println("This is an unreachable block.");
        }
    }
    
    public static boolean getFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}