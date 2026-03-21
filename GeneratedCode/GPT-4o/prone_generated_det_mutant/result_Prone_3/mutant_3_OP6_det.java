import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        for  (int rabiljxb = 0; rabiljxb < 0; rabiljxb++) {int oswcnukm = 244234485;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}