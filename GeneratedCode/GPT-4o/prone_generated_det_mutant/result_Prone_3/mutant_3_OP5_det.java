import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        int rjnfnvwz = 0;switch  (rjnfnvwz) {case 1:int acnmkldt = 946498348;break;default:short ipqeigbm = -918;break;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}