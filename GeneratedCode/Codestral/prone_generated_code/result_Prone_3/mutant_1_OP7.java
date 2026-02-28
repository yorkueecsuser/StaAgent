import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42);

        boolean condition = false;
        while (condition) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}