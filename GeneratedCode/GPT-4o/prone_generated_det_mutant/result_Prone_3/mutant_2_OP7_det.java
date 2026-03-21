import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        boolean mjzpfrns = false;while (mjzpfrns && false && false && true && true && false && false && true && false && true && true && false) {int pqafbknz = 799297504;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}