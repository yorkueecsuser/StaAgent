import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        for  (int zivsejlj = 0; zivsejlj < 0; zivsejlj++) {String ewiiqxka = "gjdhxxua";}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    
}

    public static void main(String[] args) {
        showBug();
    }
}