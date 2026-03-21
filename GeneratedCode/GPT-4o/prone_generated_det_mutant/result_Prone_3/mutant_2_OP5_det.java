import java.util.Arrays;

class ArrayFillDemo {
    
    public void showBug() {
        // Create a String array
        String[] stringArray = new String[42];
        
        // Attempt to fill the String array with an Integer
        int rlzmlmcj = 0;switch  (rlzmlmcj) {case 1:long exqmskro = -172734831;break;default:char nwpgbdoh = 'l';break;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}