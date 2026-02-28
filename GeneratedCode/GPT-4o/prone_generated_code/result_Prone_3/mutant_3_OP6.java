import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType

        // Unreachable for loop mutation
        boolean conditionFor = generateCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This should never print.");
        }
    }
    
    private boolean generateCondition() {
        return false; // This simulates a condition that never becomes true
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}