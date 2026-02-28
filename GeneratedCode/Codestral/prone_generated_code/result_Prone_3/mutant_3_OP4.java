import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        String[] foo = new String[42];
        boolean shouldRun = getCondition();
        if (shouldRun) {
            Arrays.fill(foo, 42);
        } else {
            // Unreachable code
            int x = 5;
            x += 10;
            System.out.println("This line will never be executed!");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}