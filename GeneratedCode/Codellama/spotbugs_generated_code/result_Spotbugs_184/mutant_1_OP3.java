import java.util.Arrays;
import java.util.List;

class BuggyClass {
    // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
    public static String[] fruits = {"apple", "banana", "orange"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fruits));
    }

    public static void showBug() {
        fruits = new String[] {"mango", "pineapple", "strawberry"};
        System.out.println(Arrays.toString(fruits));
    }

    // Unreachable if statement mutation
    public static void unreachableIfStatement() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This statement is unreachable");
        }
    }

    // Helper method to generate a boolean condition
    private static boolean getCondition() {
        return Math.random() < 0.5;
    }
}