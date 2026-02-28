import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType

        // Introduce an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // non-final variable to avoid unreachable code error
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            case 2:
                System.out.println("This is also unreachable");
                break;
            default:
                break;
        }
    }
    
    // Method to provide a non-final value always not matching the switch cases
    private int getUnreachableValue() {
        return 0; // Ensures switch cases are never reached
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}