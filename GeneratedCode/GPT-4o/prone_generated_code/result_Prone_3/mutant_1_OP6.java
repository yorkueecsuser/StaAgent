import java.util.Arrays;

class ArrayFillDemo {

    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
        
        // Insert unreachable for loop
        boolean unreachableCondition = getCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This is an unreachable statement");
        }
    }

    public boolean getCondition() {
        return false; // Dynamic method call returning false
    }

    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}