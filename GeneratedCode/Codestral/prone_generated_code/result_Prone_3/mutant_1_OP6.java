import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String[] foo = new String[42];
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Inserted unreachable for loop
            // This loop is unreachable as the condition is always false
        }
        Arrays.fill(foo, 42);
    }

    public static void main(String[] args) {
        showBug();
    }
}