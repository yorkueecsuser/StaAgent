import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42);

        // Unreachable if-else statement mutant
        if (getCondition()) {
            System.out.println("This code will never execute.");
        } else {
            System.out.println("This code will also never execute.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}