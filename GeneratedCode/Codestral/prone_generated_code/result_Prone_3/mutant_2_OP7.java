import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String[] foo = new String[42];
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This code is unreachable");
        }
        Arrays.fill(foo, 42); // Original code
    }

    public static void main(String[] args) {
        showBug();
    }
}