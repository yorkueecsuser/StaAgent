import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] stringArray = new String[42];
        int rpgsxrip = 0;switch  (rpgsxrip) {case 1:float xkwxtzdc = 344280679;break;default:char llcsxbmf = 'q';break;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}