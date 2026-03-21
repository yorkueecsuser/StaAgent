import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        if (false && true && true && false && true && false && true && true && false && false && false) {float pvlewrxa = -826220953;}else{int pwryjewb = -44462644;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    
}

    public static void main(String[] args) {
        showBug();
    }
}