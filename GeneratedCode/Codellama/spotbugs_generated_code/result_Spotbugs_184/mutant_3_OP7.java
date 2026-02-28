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

    // New method to return a boolean value to be used as the condition for the while loop
    public static boolean getCondition() {
        return false;
    }

    // Mutated code with unreachable while loop
    public static void mutatedCode() {
        while (getCondition()) {
            System.out.println("This code should never be executed.");
        }
    }
}