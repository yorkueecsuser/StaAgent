import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug() {
        String[] foo = new String[42];
        for(int i = 0; getUnreachableCondition(); i++) {
            // This for loop is unreachable because getUnreachableCondition() always returns false
        }
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    }

    public static void main(String[] args) {
        showBug();
    }
}