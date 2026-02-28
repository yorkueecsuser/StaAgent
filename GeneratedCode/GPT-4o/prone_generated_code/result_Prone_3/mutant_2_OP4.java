import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This will always be printed.");
        }
    }
    
    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}