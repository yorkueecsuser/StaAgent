import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    private static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String[] foo = new String[42];
        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable loop");
        }
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    }

    public static void main(String[] args) {
        showBug();
    }
}