import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] bshbscfs = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(bshbscfs, 42); // BUG: ArrayFillIncompatibleType
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}