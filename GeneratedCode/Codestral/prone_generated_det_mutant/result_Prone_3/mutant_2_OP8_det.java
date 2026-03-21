import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] qfskbuby = new String[42];
        Arrays.fill(qfskbuby, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    }

    public static void main(String[] args) {
        showBug();
    }
}