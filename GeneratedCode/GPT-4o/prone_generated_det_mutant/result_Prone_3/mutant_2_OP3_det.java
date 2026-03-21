import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        if (false && false && false && true && false && false && false && true && false && false && false) {boolean ehlfjndl = false;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}