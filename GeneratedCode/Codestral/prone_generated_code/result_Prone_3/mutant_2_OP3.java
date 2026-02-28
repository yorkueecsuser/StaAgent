import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]

        // Added unreachable if statement
        if (getFalseCondition()) {
            // This code will never execute
            System.out.println("This is an unreachable code block");
        }
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}