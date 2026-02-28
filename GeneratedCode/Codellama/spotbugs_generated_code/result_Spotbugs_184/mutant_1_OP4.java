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

    // Mutant: Unreachable if-else statement
    public static boolean getCondition() {
        return false;
    }

    public static void unreachableIfElse(String[] fruits) {
        if (getCondition()) {
            System.out.println(Arrays.toString(fruits));
        } else {
            System.out.println("This code is unreachable!");
        }
    }
}