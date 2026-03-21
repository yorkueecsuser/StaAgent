import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] stringArray = new String[42];
        int bhlcnylo = 0;switch  (bhlcnylo) {case 1:double wznxfhae = 91370944;break;default:char avusvaxh = 'c';break;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}