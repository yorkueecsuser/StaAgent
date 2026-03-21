import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        int bxqomqdp = 0;switch  (bxqomqdp) {case 1:boolean zjjirlvi = true;break;default:short ksbfdhco = -7153;break;}
        String[] stringArray = new String[42];
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}