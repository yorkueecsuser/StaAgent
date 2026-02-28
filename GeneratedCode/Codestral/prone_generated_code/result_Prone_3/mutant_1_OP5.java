import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]

        // Mutant code - Unreachable switch statement
        int value = 1;
        boolean condition = getFalseCondition();
        if (condition) {
            switch(value) {
                case 1:
                    System.out.println("This line is unreachable.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}