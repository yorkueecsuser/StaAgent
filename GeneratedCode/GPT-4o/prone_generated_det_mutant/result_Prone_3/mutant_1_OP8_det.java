import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] tkoeshmz = new String[42];
        
        // Attempt to fill the String array with an Integer
        Arrays.fill(tkoeshmz, 42); // BUG: ArrayFillIncompatibleType
    }
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}