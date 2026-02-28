import java.util.Arrays;

class ArrayFillDemo {

    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType

        // Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is never executed.");
        }
    }
    
    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable.
    }

    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}