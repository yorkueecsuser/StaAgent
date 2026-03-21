import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        if (true && true && false && false && true && true && false && true && true && true && false) {String fbasnrvo = "lytmieon";}else{double fvyubuqm = -534229819;}
        String[] stringArray = new String[42];
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}